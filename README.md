# Adding-Lottie-animation-to-android-project

first add the dependency to your project build.gradle file:
    dependencies {
    ...
    implementation "com.airbnb.android:lottie:$lottieVersion"
    ...
}

*****  Remember to sync the gradle *****


add the latest version to the place where $lottieVersion;
 Ex; 
  dependencies {
    ...
    implementation "com.airbnb.android:lottie:3.7.0"
    ...
}

download the lottie animation jason file 

add the json file to src/main/assets.

add text view to the layout xml file and do the relative constraints
then add this code lines to the text view segment and remove the <textview code

<com.airbnb.lottie.LottieAnimationView
        android:id="@+id/animation_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        app:lottie_rawRes="@raw/hello_world"
        // or
        app:lottie_fileName="hello_world.json"

        // Loop indefinitely
        app:lottie_loop="true"
        // Start playing as soon as the animation is loaded
        app:lottie_autoPlay="true" />
