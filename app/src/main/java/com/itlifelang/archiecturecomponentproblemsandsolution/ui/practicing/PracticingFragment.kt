package com.itlifelang.archiecturecomponentproblemsandsolution.ui.practicing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.itlifelang.archiecturecomponentproblemsandsolution.R
import com.itlifelang.archiecturecomponentproblemsandsolution.databinding.FragmentPracticingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PracticingFragment : Fragment() {

    private val viewModel: PracticingViewModel by viewModels()

    // Inflate binding
    private lateinit var binding: FragmentPracticingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_practicing, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            viewModel = this@PracticingFragment.viewModel
            lifecycleOwner = viewLifecycleOwner
        }
    }

    /**
     * Todo: Set up person list inside its [RecyclerView]
     */
    private fun setupPersonList() {
        // This is good because no findViewById :)
        binding.personList
    }
}
