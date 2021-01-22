package com.itlifelang.archiecturecomponentproblemsandsolution.ui.solution1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import kotlinx.android.synthetic.main.fragment_solution1.*
import kotlin.random.Random

class Solution1Fragment : Fragment() {

    private val viewModel: Solution1ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_solution1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val random = Random(100)
        // Set value of a LiveData via a method
        view.setOnClickListener {
            viewModel.setNumber(random.nextInt())
        }
        // Observe a LiveData
        viewModel.number.observe(viewLifecycleOwner) {
            tv_solution1.text = it.toString()
        }
        // Test set LiveData via directly
        (viewModel.numberText as MutableLiveData).value = "Test"
    }
}

