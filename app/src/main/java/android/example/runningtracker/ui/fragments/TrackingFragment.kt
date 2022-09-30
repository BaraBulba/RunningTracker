package android.example.runningtracker.ui.fragments

import androidx.fragment.app.Fragment
import android.example.runningtracker.R
import android.example.runningtracker.ui.view_models.MainViewModel
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()

}