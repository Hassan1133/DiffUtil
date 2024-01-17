package com.example.diffutil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter : ListAdapter<Person, PersonAdapter.ProgrammingViewHolder>(DiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_recycler_design, parent, false)
        return ProgrammingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgrammingViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class ProgrammingViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val iconTxt: TextView = view.findViewById(R.id.programmingIcon)
        private val name: TextView = view.findViewById(R.id.programmingName)

        fun bind(item : Person)
        {
            iconTxt.text = item.iconTxt
            name.text = item.name
        }
    }

    class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<Person>(){
        override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Person,
            newItem: Person
        ): Boolean {
            return oldItem == newItem
        }
    }
}