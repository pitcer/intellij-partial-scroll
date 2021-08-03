plugins {
    java
    kotlin("jvm") version "1.5.21"
    id("org.jetbrains.intellij") version "1.1.3"
}

group = "com.github.pitcer.partialscroll"
version = "0.1.0"

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
    version.set("2021.1")
}
