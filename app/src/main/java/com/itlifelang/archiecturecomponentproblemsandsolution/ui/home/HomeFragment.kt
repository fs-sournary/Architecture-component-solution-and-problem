package com.itlifelang.archiecturecomponentproblemsandsolution.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupEvents()
    }

    private fun setupEvents() {
        bt_problem_0.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToProblem0()
            navController.navigate(directions)
        }
        bt_solution_0.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToSolution0()
            navController.navigate(directions)
        }
        bt_problem_1.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToProblem1()
            navController.navigate(directions)
        }
        bt_solution_1.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToSolution1()
            navController.navigate(directions)
        }
        bt_problem_2.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToProblem2()
            navController.navigate(directions)
        }
        bt_problem_3.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToProblem3(1)
            navController.navigate(directions)
        }
        bt_solution_3.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToSolution3(1)
            navController.navigate(directions)
        }
        bt_problem_4.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToProblem4()
            navController.navigate(directions)
        }
        bt_solution_4.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToSolution4()
            navController.navigate(directions)
        }
        bt_practicing.setOnClickListener {
            val directions = HomeFragmentDirections.navigateToPracticing()
            navController.navigate(directions)
        }
    }
}
