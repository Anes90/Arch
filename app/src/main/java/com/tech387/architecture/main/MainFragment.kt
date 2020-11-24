package com.tech387.architecture.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.tech387.architecture.BaseFragment
import com.tech387.architecture.data.Profile
import com.tech387.architecture.databinding.MainFragBinding
import com.tech387.architecture.util.list_item.ListItemAdapter

class MainFragment : BaseFragment(), MainListener {

    private lateinit var binding: MainFragBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragBinding.inflate(inflater, container, false).apply {
            viewModel = obtainViewModel(MainViewModel::class.java)
            lifecycleOwner = viewLifecycleOwner
        }

        binding.viewModel?.getProfiles() //Dobavlja profile iz repozitorija preko viewModela

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupAdapter()
    }

    private fun setupAdapter() {
        binding.list.adapter = ListItemAdapter(requireContext(), this) //Prosljedje ListItemAdapter u RecyclerView MainFragmenta
    }

    override fun onProfileClick(profile: Profile) {
        binding.viewModel?.removeProfile(profile) //Uklanja profil (implementirano u MainViewModel)

        Toast.makeText(requireContext(), "Profile Removed: ${profile.name}", Toast.LENGTH_SHORT).show()
    }

}