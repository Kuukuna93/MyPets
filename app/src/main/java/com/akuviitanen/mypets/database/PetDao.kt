package com.akuviitanen.mypets.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@Dao
interface PetDao {
    @Query("SELECT * FROM pet")
    fun getAll(): Flow<List<Pet>>

    @Query("SELECT * FROM pet WHERE uid IN (:petIds)")
    fun loadAllByIds(petIds: IntArray): List<Pet>

    @Query("SELECT * FROM pet WHERE nickname LIKE :nickname OR " +
            "full_name LIKE :fullname LIMIT 1")
    fun findByName(nickname: String, fullname: String): Pet

    @Insert
    fun insertAll(vararg pets: Pet)

    @Delete
    fun delete(pet: Pet)
}
