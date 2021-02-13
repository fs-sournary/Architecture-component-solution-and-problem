package com.itlifelang.archiecturecomponentproblemsandsolution.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.itlifelang.archiecturecomponentproblemsandsolution.databinding.FragmentHomeBinding
import com.itlifelang.archiecturecomponentproblemsandsolution.extension.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding by autoCleared()
    private var adapter: HomePersonListAdapter by autoCleared()

    private val viewModel: HomeViewModel by viewModels()

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
        adapter = HomePersonListAdapter {
            viewModel.savePersonToDb(it)
        }
        binding.personList.adapter = adapter
    }

    private fun setupViewModel() {
        viewModel.apply {
            loading.observe(viewLifecycleOwner) {
                binding.progress.isVisible = it
            }
            persons.observe(viewLifecycleOwner) {
                it?.apply { adapter.submitList(this) }
            }
            error.observe(viewLifecycleOwner) {
                it?.apply { binding.errorText.text = this.message }
            }
        }
    }
}
