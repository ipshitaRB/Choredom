package com.droidrbi.choredom

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter : RecyclerView.Adapter<TodoListViewHolder>() {

    private var todoList = mutableListOf ("Android Development","House Work", "Errands", "Shopping")

    fun addNewItem(item:String){
        todoList.add(item)
        //notify adapter that list has changed
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.todo_list_view_holder, parent,false)
        return TodoListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        holder.listPosititonTextView.text = (position + 1).toString()
        holder.listTitleTextView.text = todoList[position]

    }
}