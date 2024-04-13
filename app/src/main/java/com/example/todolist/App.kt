package com.example.todolist

import android.app.Application
import com.example.todolist.ListItemService

class App : Application() {
    val listItemService = ListItemService()
}