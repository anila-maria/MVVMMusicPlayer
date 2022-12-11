package com.musicgraphicalinterfaces.Fragments

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.R
import com.recycleradapter.SongsAdapter
import com.baseclasses.BaseFragment
import com.databinding.FragmentLibraryBinding
import com.musicdatabase.entities.PlaylistModel
import com.musicdatabase.entities.SongModel
import com.helper.Coordinator
import com.interfaces.PassDataForSelectPlaylists
import com.repo.RoomRepository
import com.musicgraphicalinterfaces.dialogs.AddSongToPlaylistDialog
import com.utils.beGone
import com.utils.beVisible
import com.livedataviewmodels.SongsViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LibraryFragment : BaseFragment(R.layout.fragment_library), PassDataForSelectPlaylists {

    companion object Library {

        var songsAdapter: SongsAdapter? = null

        lateinit var viewModel: SongsViewModel

        lateinit var mactivity: FragmentActivity

        lateinit var selectedSong: SongModel
        lateinit var selectedPlaylists: ArrayList<PlaylistModel>

        const val DELETE_REQUEST_CODE = 2

        fun notifyDataSetChanges() {
            viewModel.updateDataset()
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        when (requestCode) {
            2 -> if (resultCode == Activity.RESULT_OK) {
                notifyDataSetChanges()
            }
            else -> {
            }
        }
    }

    override fun onResume() {
        super.onResume()

        binding.pullToRefresh.setOnRefreshListener {
            notifyDataSetChanges()
            binding.pullToRefresh.isRefreshing = false
        }

        binding.songsRv.layoutManager = LinearLayoutManager(context)

        viewModel.updateDataset()

        mactivity = requireActivity()

    }

   private val binding get() = _binding as FragmentLibraryBinding




    private val songListUpdateObserver = Observer<ArrayList<Any>> { dataset ->
        if (dataset.isNotEmpty()) {
            songsAdapter?.dataset = dataset as ArrayList<SongModel>
            binding.mEmpty.beGone()
            binding.songsRv.apply {
                beVisible()
                adapter = songsAdapter
            }
        } else {
            with(binding) {
                mEmpty.beVisible()
                songsRv.beGone()
            }
        }

    }

    fun createDialogToSelectPlaylist() {

        RoomRepository.updateCachedPlaylist()

        val addSongToPlaylistDialog = RoomRepository.cachedPlaylistArray?.let {
            AddSongToPlaylistDialog(
                it
            )
        }


        addSongToPlaylistDialog?.setTargetFragment(this, 0)
        this.fragmentManager?.let { it1 -> addSongToPlaylistDialog?.show(it1, "pl") }

    }

    override fun passDataToInvokingFragment(playlists: ArrayList<PlaylistModel>) {

        selectedPlaylists = playlists

        addSongToSelectedPlaylist()

        selectedPlaylists.clear()

    }

    private fun addSongToSelectedPlaylist() {

        for (playlist in selectedPlaylists) {
            addSongToPlaylist(playlist)
        }
    }

    fun addSongToPlaylist(playlist: PlaylistModel) {
        GlobalScope.launch {

            RoomRepository.addSongsToPlaylist(
                playlist.name,
                selectedSong.id.toString()
            )
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = DataBindingUtil.bind(view)!!

        Coordinator.updateNowPlayingQueue()
        viewModel = ViewModelProvider(this).get(SongsViewModel::class.java)

        context?.let { viewModel.setFragmentContext(it) }
        viewModel.dataset.observe(viewLifecycleOwner, songListUpdateObserver)

        songsAdapter = activity?.let {
            SongsAdapter(
                it,
                viewModel.dataset.value as ArrayList<SongModel>
            )
        }

        songsAdapter?.OnDataSend(
            object : SongsAdapter.OnDataSend {
                override fun onSend(context: Activity, songModel: SongModel) {

                    selectedSong = songModel

                    if (RoomRepository.cachedPlaylistArray != null) {
                        if (RoomRepository.cachedPlaylistArray.size > 0) {
                            createDialogToSelectPlaylist()
                        } else {
                            val i = RoomRepository.cachedPlaylistArray
                            Toast.makeText(
                                requireActivity().baseContext,
                                getString(R.string.createPlaylist_error),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Toast.makeText(
                            requireActivity().baseContext,
                            getString(R.string.createPlaylist_error),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        )

        notifyDataSetChanges()

        RoomRepository.convertFavSongsToRealSongs()
    }
}