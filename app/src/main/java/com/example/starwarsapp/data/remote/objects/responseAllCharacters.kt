package com.example.starwarsapp.data.remote.objects

data class responseAllCharacters(
    val info: infoResponseAllCharacters,
    val data: List<responseCharacter>
)


data class infoResponseAllCharacters(
    val total: Int,
    val page: Int,
    val limit: Int,
    val next: String,
    val prev : String
)


