package com.federicocotogno.habittracker2020.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.federicocotogno.habittracker2020.data.models.Habit

@Dao
interface HabitDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addHabit(habit: Habit)

    @Update
    suspend fun updateHabit(habit: Habit)

    @Delete
    suspend fun deleteHabit(habit: Habit)

    @Query("SELECT * FROM habit_table ORDER BY habit_startTime DESC")
    fun getAllHabits(): LiveData<List<Habit>>

    @Query("DELETE FROM habit_table")
    suspend fun deleteAll()
}