plugins {
    `java-library`
    application
}

application.mainClassName = "com.okapilib.testidk.javaui.server.MainKt"

description = "A JavaFX UI for the kernel."

dependencies {
    implementation(project(":kernel"))
}
