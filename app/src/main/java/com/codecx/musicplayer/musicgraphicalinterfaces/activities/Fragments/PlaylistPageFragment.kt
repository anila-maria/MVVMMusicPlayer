package com.codecx.musicplayer.musicgraphicalinterfaces.Fragments

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.R
import com.recycleradapter.PlaylistPageAdapater
import com.baseclasses.BaseFragment
import com.databinding.FragmentPlaylistPageBinding
import com.musicdatabase.entities.SongModel
import com.utils.beGone
import com.utils.beVisible
import com.livedataviewmodels.PlaylistPageViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class PlaylistPageFragment(val playlistId: Long) : BaseFragment(R.layout.fragment_playlist_page) {

    val binding get() = _binding as FragmentPlaylistPageBinding


    val viewModel: PlaylistPageViewModel by viewModel()

    lateinit var playlistSongsAdapter: PlaylistPageAdapater


    private fun setupViewModel() {
        viewModel.setPlayllistId(playlistId)
        viewModel.dataset.observe(viewLifecycleOwner, playlistSongsObserver)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = DataBindingUtil.bind(view)!!

        setupViewModel()

        playlistSongsAdapter = context?.let {
            PlaylistPageAdapater(
                viewModel.getDataset(),
                it as Activity
            )
        }!!

        playlistSongsAdapter.playlist_name = getPlaylistName(playlistId)
        val playlists = PlaylistFragment.viewModel?.getDataSet()
        for (playlist in playlists!!) {
            if (playlist.id == playlistId) {
                binding.playlistNameTv.text = playlist.name
            }
        }


        binding.playlistsSongsRv.layoutManager = LinearLayoutManager(context)

//        binding.playlistsSongsRv.adapter = playlistSongsAdapter


        binding.playlistBackBtn.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        playlistSongsAdapter.OnDataSend(
            object : PlaylistPageAdapater.OnDataSend {
                override fun onSend(context: Activity, id: String) {
                    viewModel.updateDataset()
                }

                override fun onDelete(id: String) {
                    viewModel.playlistPageRepository.removeSongFromPlaylist(
                        id
                    )
                    onSend(requireActivity(), id)
                }
            }
        )

        viewModel.updateDataset()
    }


    private val playlistSongsObserver = Observer<ArrayList<Any>> { dataset ->
        if (dataset.isNotEmpty()) {
            playlistSongsAdapter.dataset = dataset as ArrayList<SongModel>
            binding.mEmpty.beGone()
            binding.playlistsSongsRv.apply {
                beVisible()
                adapter = playlistSongsAdapter
            }
        } else {
            with(binding) {
                mEmpty.beVisible()
                playlistsSongsRv.beGone()
            }
        }

    }

    fun getPlaylistName(id: Long): String {
        for (playlist in PlaylistFragment.viewModel?.getDataSet()!!) {
            if (playlist.id == id) {
                return playlist.name
            }
        }
        return ""
    }

}