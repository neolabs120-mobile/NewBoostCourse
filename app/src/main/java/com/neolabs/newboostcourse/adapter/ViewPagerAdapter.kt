package com.neolabs.newboostcourse.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import anolabs.cinemaheaven2.item.MovieListItem
import anolabs.cinemaheaven2.network.Movie
import com.bumptech.glide.Glide
import com.neolabs.newboostcourse.R

class ViewPagerAdapter(private val dataValue: ArrayList<Movie>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val movie_poaster: ImageView = view.findViewById(R.id.movie_poster)
        val movie_subject: TextView = view.findViewById(R.id.movie_subject)
        val movie_info: TextView = view.findViewById(R.id.movie_info)
        val button: Button = view.findViewById(R.id.movie_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder =
        ViewPagerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.viewpage_layout, parent, false)
        )

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        Glide.with(holder.movie_poaster.context).load(dataValue.get(position).image).into(holder.movie_poaster)
        holder.movie_subject.text = dataValue.get(position).title
        holder.movie_info.text = dataValue.get(position).audience_rating + "점"
        holder.button.setOnClickListener {
            //position에 따라 다른 영화 상세히 보기기
       }
    }

    override fun getItemCount(): Int = dataValue.size
}