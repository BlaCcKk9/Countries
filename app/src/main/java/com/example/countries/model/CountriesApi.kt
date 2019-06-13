package com.example.countries.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface CountriesApi {
    @GET("/devtides/countries/master/countriesV2.json")
    fun getCountries(): Single<List<Country>>
}