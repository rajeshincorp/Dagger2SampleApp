plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    //Step 1 : add kotlin-kapt for annotations
    id("kotlin-kapt") //if you use it then you will have to use
    //kapt("com.google.dagger:dagger-compiler:2.51.1") in dependency
}

android {
    namespace = "sindri.lab.dagger2sample"
    compileSdk = 34

    defaultConfig {
        applicationId = "sindri.lab.dagger2sample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Step 1 : Add dependencies, go to dagger official website to check current version and how to add dependencies
    implementation("com.google.dagger:dagger-android:2.51.1")
    kapt("com.google.dagger:dagger-android-processor:2.51.1")
    kapt("com.google.dagger:dagger-compiler:2.51.1")
}