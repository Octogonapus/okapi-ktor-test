package com.okapilib.testidk.kernelexample

import com.okapilib.testidk.kernel.server.Server
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    val server = Server.create()
    runBlocking {
        server.start()
    }
}
