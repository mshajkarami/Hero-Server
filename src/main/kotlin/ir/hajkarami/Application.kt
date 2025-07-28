package ir.hajkarami

import io.ktor.server.application.*
import ir.hajkarami.plugins.configureFrameworks
import ir.hajkarami.plugins.configureMonitoring
import ir.hajkarami.plugins.configureRouting
import ir.hajkarami.plugins.configureSerialization

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureFrameworks()
    configureRouting()
}

