package com.neolabs.newboostcourse.retrofit

import android.os.Bundle
import anolabs.cinemaheaven2.item.MovieListItem
import anolabs.cinemaheaven2.network.MovieList
import dagger.Provides
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

interface MovieService {
    @GET("/movie/readMovieList")
    suspend fun getmovielist(): Response<MovieList>
}

interface MovieHelper {
    suspend fun getmovielist(): Response<MovieList>
}