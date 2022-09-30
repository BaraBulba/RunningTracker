package android.example.runningtracker.ui.view_models

import android.example.runningtracker.repositories.MainRepository
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


// оснавная задача, собирать данные с репозиториев и предоставлять их для всех наших фрагментов
@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}