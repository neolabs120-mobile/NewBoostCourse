package com.neolabs.newboostcourse.repository

import com.neolabs.newboostcourse.retrofit.MovieHelper
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val movieHelper: MovieHelper
){
    suspend fun getmovelist() = movieHelper.getmovielist()
}