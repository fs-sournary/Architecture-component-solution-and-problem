package com.itlifelang.archiecturecomponentproblemsandsolution.ui.localperson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.itlifelang.archiecturecomponentproblemsandsolution.databinding.ItemLocalPersonBinding
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person

class LocalPersonViewHolder(private val binding: ItemLocalPersonBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(person: Person) {
        binding.titleText.text = person.name
        Glide.with(binding.logoImage)
            .load(person.avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.logoImage)
    }

    companion object {

        fun create(parent: ViewGroup): LocalPersonViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemLocalPersonBinding.inflate(inflater, parent, false)
            return LocalPersonViewHolder(binding)
        }
    }
}
