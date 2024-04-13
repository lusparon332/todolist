package com.example.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ListItemAdapter
    private val listItemService = ListItemService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        adapter = ListItemAdapter()
        adapter.data = listItemService.getItems()

        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = adapter
        
    }
}