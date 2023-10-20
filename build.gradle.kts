plugins {
    java
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.intellij") version "1.16.0"
}

group = "com.github.pitcer.partialscroll"
version = "0.2.2"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

intellij {
    version.set("2023.2")
}

tasks {
    patchPluginXml {
        version.set("${project.version}")
        sinceBuild.set("232")
    }

    compileKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}

