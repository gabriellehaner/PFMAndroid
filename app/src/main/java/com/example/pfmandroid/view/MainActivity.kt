package com.example.pfmandroid.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pfmandroid.R
import com.example.pfmandroid.model.DataSource
import com.example.pfmandroid.model.ProfileAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

//    private lateinit var profileAdapter: ProfileAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        //app em tela cheia
        val decorView = window.decorView
        val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
        decorView.systemUiVisibility = uiOptions

            //retirar barra de título
        supportActionBar!!.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        populateItems()
//        initAdapter()
//    }
//
//    private fun populateItems() {
//        val DataSource = DataSource.createDataSet()
//        profileAdapter.setDataSet(DataSource)
//    }
//
//    private fun initAdapter() {
//        profileAdapter = ProfileAdapter { profile ->
//
//        }
//
//        recyclerView.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = profileAdapter
//        }
    }


}