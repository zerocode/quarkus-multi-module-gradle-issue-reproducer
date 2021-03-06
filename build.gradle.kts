import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    id("io.quarkus") version "1.13.2.Final"
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {

    apply {
        plugin("kotlin")
        plugin("io.quarkus")
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:1.13.2.Final"))
        testImplementation("io.quarkus:quarkus-junit5")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
        kotlinOptions.javaParameters = true
    }
}
