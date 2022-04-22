package com.neolabs.newboostcourse.model

import com.google.gson.annotations.SerializedName

class Result (

    @SerializedName("id"                ) var id               : Int?    = null,
    @SerializedName("title"             ) var title            : String? = null,
    @SerializedName("title_eng"         ) var titleEng         : String? = null,
    @SerializedName("date"              ) var date             : String? = null,
    @SerializedName("user_rating"       ) var userRating       : Double? = null,
    @SerializedName("audience_rating"   ) var audienceRating   : Double? = null,
    @SerializedName("reviewer_rating"   ) var reviewerRating   : Double? = null,
    @SerializedName("reservation_rate"  ) var reservationRate  : Double? = null,
    @SerializedName("reservation_grade" ) var reservationGrade : Int?    = null,
    @SerializedName("grade"             ) var grade            : Int?    = null,
    @SerializedName("thumb"             ) var thumb            : String? = null,
    @SerializedName("image"             ) var image            : String? = null

)