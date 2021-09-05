package com.akuviitanen.mypets.hilt

import android.content.Context
import androidx.room.Room
import com.akuviitanen.mypets.database.AppDatabase
import com.akuviitanen.mypets.database.PetDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule{
    @Provides
    fun providePetDao(database: AppDatabase): PetDao {
        return database.petDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "MytPetsDB"
        ).build()
    }
}


