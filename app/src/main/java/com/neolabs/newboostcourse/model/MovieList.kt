package anolabs.cinemaheaven2.network

import com.google.gson.annotations.SerializedName
import com.neolabs.newboostcourse.model.Result

data class MovieList (

    @SerializedName("message"    ) var message    : String?           = null,
    @SerializedName("code"       ) var code       : Int?              = null,
    @SerializedName("resultType" ) var resultType : String?           = null,
    @SerializedName("result"     ) var result     : ArrayList<Movie> = arrayListOf()

)