package com.musicgraphicalinterfaces.Fragments

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.R
import com.recycleradapter.FavAdapter
import com.baseclasses.BaseFragment
import com.databinding.FragmentFavoriteBinding
import com.musicdatabase.entities.SongModel
import com.utils.beGone
import com.utils.beVisible
import com.livedataviewmodels.FavViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavoriteFragment : BaseFragment(R.layout.fragment_favorite) {

    private val binding get() = _binding as FragmentFavoriteBinding

    private val viewModel: FavViewModel by viewModel()

    lateinit var favSongsAdapter: FavAdapter


    override fun onResume() {
        viewModel.updateDataset()
        super.onResume()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = DataBindingUtil.bind(view)!!

        binding.favRv.layoutManager = LinearLayoutManager(context)
        favSongsAdapter = context?.let {
            FavAdapter(
                it as Activity,
                viewModel.getDataset()
            )
        }!!

        observer()
    }

    private fun observer() {
        viewModel.dataset.observe(viewLifecycleOwner) { dataset ->
            if (dataset.isNotEmpty()) {
                binding.mEmpty.beGone()
                favSongsAdapter.dataset = dataset as ArrayList<SongModel>
                binding.favRv.apply {
                    beVisible()
                    adapter = favSongsAdapter
                }
            } else {
                with(binding) {
                    mEmpty.beVisible()
                    favRv.beGone()
                }
            }
        }
    }

}