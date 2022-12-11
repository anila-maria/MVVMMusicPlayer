package com.musicgraphicalinterfaces.activities

import android.Manifest
import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import com.R
import com.baseclasses.BaseActivity
import com.databinding.ActivityMainBinding
import com.helper.Coordinator
import com.repo.RoomRepository
import com.musicservices.NotificationPlayerService
import com.musicgraphicalinterfaces.Fragments.MainFragment
import com.musicgraphicalinterfaces.Fragments.PlayerPanelFragment
import com.utils.PermissionProvider
import com.utils.ScreenSizeUtils.getScreenHeight
import com.sothree.slidinguppanel.SlidingUpPanelLayout


class MainActivity : BaseActivity(R.layout.activity_main) {

    companion object {
        var permissionsGranted: Boolean = false
        lateinit var playerPanelFragment: PlayerPanelFragment
        lateinit var activity: MainActivity

    }


    var prefs: SharedPreferences? = null


    private val permissions = arrayOf(
        Manifest.permission.READ_EXTERNAL_STORAGE
    )


    private val binding get() = _binding as ActivityMainBinding


    override fun onDestroy() {
        super.onDestroy()

        NotificationPlayerService.stopNotification(baseContext)

        Coordinator.mediaPlayerAgent.stop()
    }

    override fun onBackPressed() {
        onStop()
        moveTaskToBack(true)
    }


    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        activity = this
        RoomRepository.createDatabase()

        prefs = getSharedPreferences("AppName", MODE_PRIVATE)

        checkForPermissions()

        initMainFragment()

        initBottomSheet()
        with(binding) {

            slidingLayout.panelHeight = 0
            slidingLayout.requestLayout()
            slidingLayout.addPanelSlideListener(object :
                SlidingUpPanelLayout.PanelSlideListener {
                override fun onPanelSlide(panel: View?, slideOffset: Float) {
                }

                override fun onPanelStateChanged(
                    panel: View?,
                    previousState: SlidingUpPanelLayout.PanelState?,
                    newState: SlidingUpPanelLayout.PanelState?
                ) {
                    when (slidingLayout.panelState) {
                        SlidingUpPanelLayout.PanelState.EXPANDED -> {
                            playerPanelFragment.updatePanelBasedOnState(SlidingUpPanelLayout.PanelState.EXPANDED)
                        }
                        SlidingUpPanelLayout.PanelState.COLLAPSED -> {
                            playerPanelFragment.updatePanelBasedOnState(SlidingUpPanelLayout.PanelState.COLLAPSED)

                        }
                        else -> {}
                    }
                }
            })
        }


    }

    fun updateVisibility() {
        binding.slidingLayout.panelHeight = getScreenHeight() * 1 / 10
    }


    private fun checkForPermissions() {
        val permissionProvider = PermissionProvider()
        permissionProvider.askForPermission(this, permissions)

        if (permissionProvider.permissionIsGranted) {

        }

    }


    private fun initBottomSheet() {

        playerPanelFragment = PlayerPanelFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.add(
            binding.bottomSheetContainer.id,
            playerPanelFragment,
            "bottom sheet container"
        )
            .commit()
    }

    private fun initMainFragment() {
        val mainFragment = MainFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.add(
            binding.fragmentBaseContainer.id,
            mainFragment,
            "main fragment container"
        )
            .commit()
    }

}