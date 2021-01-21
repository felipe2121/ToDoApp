package br.felipeholanda.todoapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.felipeholanda.todoapp.data.model.Priority

@Entity(tableName = "todo_table")
data class ToDoData (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var priority: Priority,
    var description: String
)