package com.itlifelang.archiecturecomponentproblemsandsolution.ui.problem4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.snackbar.Snackbar
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import com.itlifelang.archiecturecomponentproblemsandsolution.ext.observeEvent

class Problem4Fragment : Fragment() {

    private val viewModel: Problem4ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = layoutInflater.inflate(R.layout.fragment_problem4, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener(viewModel.viewListener)
        viewModel.message.observeEvent(viewLifecycleOwner) {
            Snackbar.make(view, it, Snackbar.LENGTH_SHORT).show()
        }
    }
}
