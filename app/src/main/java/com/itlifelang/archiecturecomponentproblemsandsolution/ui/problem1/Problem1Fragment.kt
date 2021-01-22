package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import kotlinx.android.synthetic.main.fragment_problem1.*
import kotlin.random.Random

class Problem1Fragment : Fragment() {

    private val viewModel: Problem1ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_problem1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val random = Random(100)
        // Don't do this: set value of a MutableLiveData directly
        view.setOnClickListener {
            viewModel.number.value = random.nextInt()
        }
        // Observe the value change of this MutableLiveData
        viewModel.number.observe(viewLifecycleOwner) {
            tv_problem1.text = it.toString()
        }
    }
}
