package ir.hajkarami.routes

import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ir.hajkarami.repository.HeroRepository
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val heroRepository: HeroRepository by application.inject()

    get("heroes/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = heroRepository.searchHeroes(name = name.toString())
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}