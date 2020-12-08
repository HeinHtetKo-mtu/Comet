package com.mtu.ceit.hhk.comet.network

import com.mtu.ceit.hhk.comet.BuildConfig
import com.mtu.ceit.hhk.comet.data_models.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDB_API {


    private val TMDB_KEY: String
        get() = BuildConfig.TMDB_KEY

    @GET("3/search/movie")
    suspend fun searchMovies(@Query("api_key") key:String = TMDB_KEY,
                             @Query ("query") query:String ,
                       @Query("page") page:Int ):MovieResponse

    @GET("3/movie/now_playing")
    suspend fun getNowMovies(@Query("api_key")key : String =BuildConfig.TMDB_KEY):MovieResponse

    @GET("3/movie/upcoming")
    suspend fun getComingMovies(@Query("api_key")key : String = TMDB_KEY):MovieResponse
}