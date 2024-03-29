package pt.ipt.dam.pokeWeather.retrofit.service

import pt.ipt.dam.pokeWeather.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
interface WeatherService {

    //get current weather based on current gps location
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("lang") lang: String = "pt",
        @Query("appid") apiKey: String = "621458b7064959935ab4b148a9f412c2"
    ): Call<WeatherResponse>

    //get current weather based on a city search
    @GET("data/2.5/weather")
    fun getWeatherCity(
        @Query("q") query: String,
        @Query("lang") lang: String = "pt",
        @Query("appid") apiKey: String = "621458b7064959935ab4b148a9f412c2"
    ): Call<WeatherResponse>
}
