package ir.hajkarami.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ir.hajkarami.routes.getAllHeroes
import ir.hajkarami.routes.root
import ir.hajkarami.routes.searchHeroes

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        staticResources(remotePath = "/images", basePackage = "images")

    }
}
