// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Gradle uses Groovy as its DSL (Domain Specific Language).

// Build configuration settings can be defined here

plugins {
    kotlin("multiplatform") version "1.5.0"
}

kotlin {
    android() // Use this for Android targets
}

android {
    compileSdk = 30
}