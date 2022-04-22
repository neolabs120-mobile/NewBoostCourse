package com.neolabs.newboostcourse.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import anolabs.cinemaheaven2.item.MovieListItem
import anolabs.cinemaheaven2.network.Movie
import com.neolabs.newboostcourse.R
import com.neolabs.newboostcourse.adapter.ViewPagerAdapter
import com.neolabs.newboostcourse.databinding.ActivityMainBinding
import com.neolabs.newboostcourse.others.Status
import com.neolabs.newboostcourse.viewmodel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(){
    val mainViewModel : MainActivityViewModel by viewModels()
    private var data = ArrayList<Movie>()
    private lateinit var viewPager: ViewPager2
    private lateinit var mainbinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainbinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewPager = findViewById(R.id.pager)

        mainViewModel.getmovielist()

        mainViewModel.res.observe(this, Observer {
            when(it.status) {
                Status.SUCCESS -> {
                    data.clear()
                    Log.d("whatis", it.data!!.toString())
                    data = it.data

                    viewPager.adapter = ViewPagerAdapter(data)
                    viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
                }
                Status.LOADING -> {

                }
                Status.ERROR -> {
                    //Log.d("whatis", it.message.)
                }
            }
        })
    }
}