// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath(Lib.ANDROID_GRADLE_PLUGIN)
        classpath(Lib.KOTLIN_PLUGIN)
        classpath(Lib.KOTLIN_ALLOPEN)
        classpath(Lib.NAVIGATION_SAFE_ARGS)
        classpath(Lib.HILT_GRADLE_PLUGIN)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}
