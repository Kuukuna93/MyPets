package com.akuviitanen.mypets.ui

import androidx.lifecycle.*
import com.akuviitanen.mypets.database.Pet
import com.akuviitanen.mypets.database.PetDao
import com.akuviitanen.mypets.database.PetDao_Impl
import com.akuviitanen.mypets.repositories.PetRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (
    savedStateHandle: SavedStateHandle,
    petRepository: PetRepository
) : ViewModel(){
    val pets = petRepository.getPets().asLiveData()
}

