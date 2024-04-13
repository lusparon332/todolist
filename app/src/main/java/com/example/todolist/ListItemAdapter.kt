package com.example.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ItemListBinding

class ListItemAdapter : RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder>() {
    var data: List<ListItem> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class ListItemViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListBinding.inflate(inflater, parent, false)

        return ListItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val item = data[position]
        val context = holder.itemView.context

        with(holder.binding) {
            checkBox.text = item.taskName
            textView.text = item.taskDescription
        }
    }
}