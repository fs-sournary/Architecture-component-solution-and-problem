package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.itlifelang.archiecturecomponentproblemsandsolution.R

class Problem2Fragment : Fragment() {

    private val viewModel: Problem2ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_problem2, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Android studio prevents this: lifecycle's Observer is tied to lifecycle's fragment
        // viewModel.name.observe(this) { }

        // lifecycle's Observer is tied to lifecycle's fragment view.
        viewModel.name.observe(viewLifecycleOwner) {
            // Do something
        }
    }
}
