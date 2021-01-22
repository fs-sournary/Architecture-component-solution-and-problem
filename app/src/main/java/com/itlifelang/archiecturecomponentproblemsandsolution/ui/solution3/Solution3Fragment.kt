package com.itlifelang.archiecturecomponentproblemsandsolution.ui.solution3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import com.itlifelang.archiecturecomponentproblemsandsolution.ext.observeEvent
import com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem3.Problem3FragmentDirections
import kotlinx.android.synthetic.main.fragment_problem3.*

class Solution3Fragment : Fragment() {

    private var number = 0
    private val viewModel: Solution3ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val safeArgs: Solution3FragmentArgs by navArgs()
        number = safeArgs.number
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_solution3, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.apply {
            setNumber(this@Solution3Fragment.number)
            loading.observe(viewLifecycleOwner) {
                progress.isVisible = it == true
            }
            number.observeEvent(viewLifecycleOwner) {
                Snackbar.make(view, "Number is $it", Snackbar.LENGTH_SHORT).show()
            }
        }
        // Events
        view.setOnClickListener {
            val directions = Problem3FragmentDirections.navigateToNavigation()
            findNavController().navigate(directions)
        }
    }
}
