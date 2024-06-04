import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    java
    kotlin("jvm") version "2.0.0"
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.github.pitcer.partialscroll"
version = "0.2.4"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

intellij {
    version.set("2024.1")
}

tasks {
    patchPluginXml {
        version.set("${project.version}")
        sinceBuild.set("241")
    }

    compileKotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
}

