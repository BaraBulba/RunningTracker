package android.example.runningtracker.di

import android.content.Context
import android.example.runningtracker.db.RunningDatabase
import android.example.runningtracker.utils.Constants.RUNNING_DATABASE_NAME
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // определяет, когда объекты в нашем апп модуле создаются и уничтожаются
// суть апп модуле в том, что все зависимости, которые мы здесь определили, создадудтся в onCreate нашей BaseApplication
// и будут жить на протяжение всего жизненного цикла апки
object AppModule {
// По сути, в этом модуле мы создаем сами зависимости и доступ к ним
    @Singleton // создает единственный экземпляр нашей бд
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}