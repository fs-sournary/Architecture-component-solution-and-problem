package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem0

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itlifelang.archiecturecomponentproblemsandsolution.R

class Problem0Fragment : Fragment() {

    private val viewModel: Problem0ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_problem0, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            viewModel.launchNavigation()
        }
        viewModel.navigateEvent.observe(viewLifecycleOwner) {
            // Test with device rotation and navigation
            Snackbar.make(view, "Welcome to Android", Snackbar.LENGTH_SHORT).show()

            val directions = Problem0FragmentDirections.navigateToNavigation()
            findNavController().navigate(directions)
        }
    }
}
