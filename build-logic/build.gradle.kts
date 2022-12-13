/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
    id("org.gradle.kotlin.kotlin-dsl") version "2.4.1"
}

repositories {
    // Use the plugin portal to apply community plugins in convention plugins.
    gradlePluginPortal()
}

extra["kotlin.version"] = "1.7.21"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${property("kotlin.version")}")
    implementation("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin:${property("kotlin.version")}")
    runtimeOnly("org.jetbrains.kotlin.plugin.noarg:org.jetbrains.kotlin.plugin.noarg.gradle.plugin:${property("kotlin.version")}")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.1.0")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.0.0")


}
