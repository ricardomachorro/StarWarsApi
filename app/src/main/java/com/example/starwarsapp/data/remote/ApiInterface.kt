package com.example.starwarsapp.data.remote

import com.example.starwarsapp.data.remote.objects.responseAllCharacters
import com.example.starwarsapp.data.remote.objects.responseCharacter
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("characters")
    fun getAllCharacters(): Response<responseAllCharacters>

    @GET("characters/{Id}")
    fun getCharacter(@Path("Id") characterId: Int,): Response<responseCharacter>
}