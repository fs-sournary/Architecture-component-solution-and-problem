package com.itlifelang.archiecturecomponentproblemsandsolution.ui.localperson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.itlifelang.archiecturecomponentproblemsandsolution.databinding.FragmentLocalPersonBinding
import com.itlifelang.archiecturecomponentproblemsandsolution.extension.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LocalPersonFragment : Fragment() {

    private var binding: FragmentLocalPersonBinding by autoCleared()
    private var adapter: LocalPersonListAdapter by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLocalPersonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPersonList()
        setupViewModel()
    }

    private fun setupPersonList() {
        adapter = LocalPersonListAdapter()
        binding.personList.adapter = adapter
    }

    private fun setupViewModel() {

    }
}
