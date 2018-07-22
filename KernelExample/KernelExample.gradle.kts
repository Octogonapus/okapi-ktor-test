plugins {
    `java-library`
}

description = "An example project using the publish kernel."

repositories {
    maven {
        setUrl("https://dl.bintray.com/octogonapus/maven-artifacts/")
    }
}

dependencies {
    implementation(group = "org.okapilib", name = "kernel", version = "0.0.2")
}
