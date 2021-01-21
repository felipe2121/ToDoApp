package br.felipeholanda.todoapp.data.repository

import androidx.lifecycle.LiveData
import br.felipeholanda.todoapp.data.dao.ToDoDao
import br.felipeholanda.todoapp.data.entity.ToDoData

class ToDoRepository(
    private val toDoDao: ToDoDao
) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData) {
        toDoDao.insertData(toDoData)
    }
}