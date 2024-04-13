package com.example.todolist

class ListItemService {
    private var items = mutableListOf<ListItem>()

    init {
        items = (1..50).map {
            ListItem(
                id = it.toLong(),
                taskName = "task#$it",
                taskDescription = "Description of task #$it",
                isDone = false
            )
        }.toMutableList()
    }

    fun getItems(): List<ListItem> = items
}