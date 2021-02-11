package com.itlifelang.archiecturecomponentproblemsandsolution.ui.localperson

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person

class LocalPersonListAdapter : ListAdapter<Person, LocalPersonViewHolder>(COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocalPersonViewHolder =
        LocalPersonViewHolder.create(parent)

    override fun onBindViewHolder(holder: LocalPersonViewHolder, position: Int) {
        val item = getItem(position) ?: return
        holder.bind(item)
    }

    companion object {

        private val COMPARATOR = object : DiffUtil.ItemCallback<Person>() {
            override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean =
                oldItem.avatar == newItem.avatar && oldItem.name == newItem.name
        }
    }
}
