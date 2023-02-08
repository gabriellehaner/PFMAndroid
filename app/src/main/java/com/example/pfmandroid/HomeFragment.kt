package com.example.pfmandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pfmandroid.model.DataSource
import com.example.pfmandroid.model.ProfileAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var profileAdapter: ProfileAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        initAdapter()
        populateItems()

    }

    private fun populateItems() {
        val dataSource = DataSource.createDataSet()
        profileAdapter.setDataSet(dataSource)
    }

    private fun initAdapter() {
        profileAdapter = ProfileAdapter { profile ->
        profile
        }

        recyclerView.apply {
            adapter = profileAdapter
            layoutManager = LinearLayoutManager(requireContext())

        }
    }


}