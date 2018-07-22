plugins {
    `java-library`
    idea
}

description = "The kernel."

dependencies {
    implementation(group = "io.ktor", name = "ktor-server-core", version = "0.9.3")
    implementation(group = "io.ktor", name = "ktor-server-netty", version = "0.9.3")
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}
