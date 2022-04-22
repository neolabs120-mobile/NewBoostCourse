package com.neolabs.newboostcourse.retrofit

import anolabs.cinemaheaven2.item.MovieListItem
import anolabs.cinemaheaven2.network.MovieList
import retrofit2.Response
import javax.inject.Inject

class MovieHelperImpl @Inject constructor(
    private val movieService: MovieService
):MovieHelper{
    override suspend fun getmovielist(): Response<MovieList> = movieService.getmovielist()
}