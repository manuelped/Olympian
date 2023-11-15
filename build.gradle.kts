// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath ("com.google.gms:google-services:4.3.10")
    }
}

plugins {
    id("com.android.application") version "8.1.3" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
}