/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("io.github.mi.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":common"))
}

application {
    // Define the main class for the application.
    mainClass.set("io.github.mi.app.AppKt")
}