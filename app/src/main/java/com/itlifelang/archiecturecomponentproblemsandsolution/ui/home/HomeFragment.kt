package com.itlifelang.archiecturecomponentproblemsandsolution.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.itlifelang.archiecturecomponentproblemsandsolution.databinding.FragmentHomeBinding
import com.itlifelang.archiecturecomponentproblemsandsolution.extension.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding by autoCleared()
    private var adapter: HomePersonListAdapter by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPersonList()
        setupViewModel()
    }

    private fun setupPersonList() {
        adapter = HomePersonListAdapter()
        binding.personList.adapter = adapter
    }

    private fun setupViewModel() {}
}
