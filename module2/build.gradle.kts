plugins {
    id("io.quarkus") version "1.13.2.Final"
}

apply {
    plugin("io.quarkus")
}

dependencies {
    implementation(project(":module1"))
}