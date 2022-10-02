package android.example.runningtracker.services

import android.content.Intent
import android.example.runningtracker.utils.Constants.ACTION_PAUSE_SERVICE
import android.example.runningtracker.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import android.example.runningtracker.utils.Constants.ACTION_STOP_SERVICE
import androidx.lifecycle.LifecycleService
import timber.log.Timber

class TrackingService: LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action){
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Service started or resumed")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Service paused")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Service stopped")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}