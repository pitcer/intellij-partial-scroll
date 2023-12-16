plugins {
    java
    kotlin("jvm") version "1.9.21"
    id("org.jetbrains.intellij") version "1.16.1"
}

group = "com.github.pitcer.partialscroll"
version = "0.2.3"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

intellij {
    version.set("2023.3")
}

tasks {
    patchPluginXml {
        version.set("${project.version}")
        sinceBuild.set("233")
    }

    compileKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}

