plugins {
    `java-library`
}

description = "An example project using the publish kernel."

repositories {
    maven {
        setUrl("https://dl.bintray.com/octogonapus/okapi-ktor-test/")
    }
}

dependencies {
    implementation(group = "org.okapilib", name = "Kernel", version = "0.0.2")
}
