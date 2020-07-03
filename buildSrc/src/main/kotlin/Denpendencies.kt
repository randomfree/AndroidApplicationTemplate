object Ver {
    const val kotlin = "1.3.72"
    const val ktx = "1.3.0"
    const val kotlinCoroutines = "1.3.7"
    const val appcompat = "1.1.0"
    const val aRouter = "1.2.2"
    const val aRouterAnnotation = "1.2.0"
    const val retrofit = "2.9.0"
    const val retrofitRxAdapter = "2.5.0"
    const val constraintLayout = "1.1.3"
    const val okhttp = "4.7.2"
    const val rxjava = "3.0.0"
    const val dagger2 = "2.28.1"
    const val room = "2.2.5"
    const val liveData = "2.2.0"
    const val viewModel = "2.2.0"
    const val multidex = "2.0.1"

}

object TestVer {

    const val junit = "4.12"
    const val androidXJunit = "1.1.1"
    const val espressoCore = "3.2.0"


}

object Denps {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Ver.kotlinCoroutines}"


    //net
    const val retrofit = "com.squareup.retrofit2:retrofit:${Ver.retrofit}"
    const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Ver.retrofitRxAdapter}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Ver.okhttp}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Ver.okhttp}"

    val netAll = arrayOf(retrofit, okhttp, okhttpLoggingInterceptor, retrofitRxAdapter)

    const val rxjava = "io.reactivex.rxjava3:rxjava:${Ver.rxjava}"
    const val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Ver.rxjava}"
    val rxAll = arrayOf(rxjava, rxAndroid)

    val netFeatureAll = arrayOf(netAll, rxAll)

    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Ver.kotlin}"
    const val ktx = "androidx.core:core-ktx:${Ver.ktx}"

    const val appcompat = "androidx.appcompat:appcompat:${Ver.appcompat}"

    //aRouter
    const val aRouter = "com.alibaba:arouter-api:${Ver.aRouter}"
    const val aRouterAnnotation = "com.alibaba:arouter-compiler:${Ver.aRouter}"


    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Ver.constraintLayout}"


    //dagger2
    const val dagger = "com.google.dagger:dagger:${Ver.dagger2}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Ver.dagger2}"

    val daggerAll = arrayOf(dagger, daggerCompiler)
    //jetpack


    //room

    const val room_runtime = "androidx.room:room-runtime:${Ver.room}"
    const val room_compiler =
        "androidx.room:room-compiler:${Ver.room}" // For Kotlin use kapt instead of annotationProcessor

    // optional - Kotlin Extensions and Coroutines support for Room
    const val room_ktx = "androidx.room:room-ktx:${Ver.room}"

    // optional - RxJava support for Room
    const val room_rxjava = "androidx.room:room-rxjava2:${Ver.room}"

    val room_all = arrayOf(room_runtime, room_ktx, room_rxjava)

    // Test helpers
    const val room_test = "androidx.room:room-testing:${Ver.room}"

    // optional - Guava support for Room, including Optional and ListenableFuture
//    const val room_guava = "androidx.room:room-guava:${Ver.room}"

    //live data

    const val liveData = "androidx.lifecycle:lifecycle-livedata:${Ver.liveData}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Ver.viewModel}"

    const val multidex = "androidx.multidex:multidex:${Ver.multidex}"

    const val junit = "junit:junit:${TestVer.junit}"
    const val androidXJunit = "androidx.test.ext:junit:${TestVer.androidXJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${TestVer.espressoCore}"

    val jTestAll = arrayOf(junit, room_test)
    val androidTestAll = arrayOf(androidXJunit, espressoCore)
}