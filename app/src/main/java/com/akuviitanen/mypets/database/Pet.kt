package com.akuviitanen.mypets.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pet(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "nickname" ) val nickname: String?,
    @ColumnInfo(name = "full_name" ) val fullName: String?,
    @ColumnInfo(name = "weight") val weight: Double?,
)