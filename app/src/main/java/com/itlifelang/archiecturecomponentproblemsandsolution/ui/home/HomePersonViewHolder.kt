package com.itlifelang.archiecturecomponentproblemsandsolution.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.itlifelang.archiecturecomponentproblemsandsolution.databinding.ItemHomePersonBinding
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person

class HomePersonViewHolder(private val binding: ItemHomePersonBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(person: Person) {
        binding.titleText.text = person.name
        binding.ageText.text = person.age.toString()
        Glide.with(binding.logoImage)
            .load(person.avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.logoImage)
    }

    companion object {

        fun create(parent: ViewGroup): HomePersonViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemHomePersonBinding.inflate(inflater, parent, false)
            return HomePersonViewHolder(binding)
        }
    }
}
