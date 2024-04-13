package com.example.todolist

data class ListItem(
    val id: Long,
    val taskName: String,
    val taskDescription: String,
    val isDone: Boolean
)