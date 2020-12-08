package com.mtu.ceit.hhk.comet.data_models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @Expose
    val page :Int,
    @SerializedName("results")
    @Expose
    val movies: List<Movie>
)

data class Movie(
    @Expose
    val id: Int,
    @Expose
    val release_date: String,
    @Expose
    val poster_path: String,
    @Expose
    val title: String,
    @Expose
    val vote_average: Float


)