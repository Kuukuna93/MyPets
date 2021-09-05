package com.akuviitanen.mypets.repositories

import com.akuviitanen.mypets.database.Pet
import com.akuviitanen.mypets.database.PetDao
import kotlinx.coroutines.flow.Flow
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class PetRepository @Inject constructor (
    private val petDao: PetDao
){
    fun getPets(): Flow<List<Pet>> {
        return petDao.getAll()
    }

    companion object{
        val FRESH_TIMEOUT = TimeUnit.DAYS.toMillis(1)
    }
}