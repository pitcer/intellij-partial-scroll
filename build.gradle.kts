plugins {
    java
    kotlin("jvm") version "1.7.10"
    id("org.jetbrains.intellij") version "1.7.0"
}

group = "com.github.pitcer.partialscroll"
version = "0.2.1"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}

intellij {
    version.set("2022.1")
    updateSinceUntilBuild.set(false)
}
