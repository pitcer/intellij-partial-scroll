import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    java
    kotlin("jvm") version "2.0.10"
    id("org.jetbrains.intellij.platform") version "2.0.1"
}

group = "com.github.pitcer.partialscroll"
version = "0.2.5"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity(providers.gradleProperty("intellijPlatformVersion"))
        instrumentationTools()
        pluginVerifier()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
    }
}

intellijPlatform {
    pluginConfiguration {
        version = "${project.version}"

        ideaVersion {
            untilBuild = provider { null }
        }
    }

    pluginVerification {
        ides {
            ide(providers.gradleProperty("intellijPlatformVersion"))
        }
    }
}
