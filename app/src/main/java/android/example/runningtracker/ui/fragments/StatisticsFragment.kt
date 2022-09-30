package android.example.runningtracker.ui.fragments


import androidx.fragment.app.Fragment
import android.example.runningtracker.R
import android.example.runningtracker.ui.view_models.StatisticsViewModel
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()

}