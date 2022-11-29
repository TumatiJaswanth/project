package com.group17.activitychecker2022.logic.repository

import androidx.lifecycle.LiveData
import com.group17.activitychecker2022.data.models.Habit
import com.group17.activitychecker2022.logic.dao.HabitDao

class HabitRepository (private val habitDao: HabitDao) {
    val getAllHabits: LiveData<List<Habit>> = habitDao.getAllHabits()

    suspend fun addHabit(habit: Habit) {
        habitDao.addHabit(habit)
    }

    suspend fun updateHabit(habit: Habit) {
        habitDao.updateHabit(habit)
    }

    suspend fun deleteHabit(habit: Habit) {
        habitDao.deleteHabit(habit)
    }

    suspend fun deleteAllHabits() {
        habitDao.deleteAll()
    }


}