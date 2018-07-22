package com.okapilib.testidk.javaui.server

import com.okapilib.testidk.kernel.server.Server
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    val server = Server.create()
    runBlocking {
        server.start()
    }
}
