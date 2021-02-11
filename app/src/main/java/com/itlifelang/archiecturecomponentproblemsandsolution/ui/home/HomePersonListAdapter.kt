package com.itlifelang.archiecturecomponentproblemsandsolution.ui.home

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person

class HomePersonListAdapter : ListAdapter<Person, HomePersonViewHolder>(COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePersonViewHolder =
        HomePersonViewHolder.create(parent)

    override fun onBindViewHolder(holder: HomePersonViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    companion object {

        private val COMPARATOR = object : DiffUtil.ItemCallback<Person>() {
            override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean =
                oldItem.name == newItem.name &&
                        oldItem.avatar == newItem.avatar &&
                        oldItem.age == newItem.age
        }
    }
}
