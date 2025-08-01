package ir.hajkarami.repository

import ir.hajkarami.models.Hero
import ir.hajkarami.models.RootResponse

interface HeroRepository {

    val heroes: Map<Int, List<Hero>>

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): RootResponse
    suspend fun searchHeroes(name: String): RootResponse
}