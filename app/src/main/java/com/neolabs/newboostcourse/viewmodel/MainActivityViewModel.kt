package com.neolabs.newboostcourse.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import anolabs.cinemaheaven2.item.MovieListItem
import anolabs.cinemaheaven2.network.Movie
import anolabs.cinemaheaven2.network.MovieList
import com.neolabs.newboostcourse.others.Resource
import com.neolabs.newboostcourse.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val mainRepository: MainRepository) : ViewModel() {
    private val _res = MutableLiveData<Resource<ArrayList<Movie>>>()

    val res : LiveData<Resource<ArrayList<Movie>>>
        get() = _res

    fun getmovielist() {
        _res.postValue(Resource.loading(null))
        viewModelScope.launch {
            mainRepository.getmovelist().let {
                if (it.isSuccessful){
                    _res.postValue(Resource.success(it.body()?.result))
                    Log.d("whathow", it.body().toString())
                }else{
                    _res.postValue(Resource.error(it.errorBody().toString(), null))
                    Log.d("whathow1", it.errorBody().toString())
                }
            }
        }
    }
}