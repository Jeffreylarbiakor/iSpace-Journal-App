# iSpace Journal App
 
Public repository
![TheMaster](https://github.com/Jeffreylarbiakor/iSpace-Bootcamp/blob/main/bandicam%202022-01-29%2015-29-13-028.jpg)
![TheMaster](https://github.com/Jeffreylarbiakor/iSpace-Bootcamp/blob/main/bandicam%202022-01-29%2015-29-22-260.jpg)


It uses a BitmapShader and **does not**:
* create a copy of the original bitmap
* use a clipPath (which is neither hardware accelerated nor anti-aliased)
* use setXfermode to clip the bitmap (which means drawing twice to the canvas)

Gradle
------
```
dependencies {
    ...
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}
```
 
Usage
-----
```xml
 <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".introslides.IntroActivity">

    <TextView
        android:id="@+id/textSkipIntro"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="70dp"
        android:text="@string/skip_intro"
        android:fontFamily="@font/roboto_regular"
        android:textColor="@color/white"
        android:textSize="14sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        />

    <com.google.android.material.button.MaterialButton
        android:id="@+id/btnNext"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="10dp"
        android:backgroundTint="@color/colorTextSecondary"
        android:fontFamily="@font/average_sans"
        android:minWidth="350dp"
        android:text="@string/next"
        android:textSize="14sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textSkipIntro"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <LinearLayout
        android:id="@+id/indicatorsContainer"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layout_marginBottom="12dp"
        android:orientation="horizontal"
        app:layout_constraintBottom_toTopOf="@+id/btnNext"
        />

    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/introSliderViewPager"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_marginBottom="12dp"
        android:overScrollMode="never"
        app:layout_constraintBottom_toTopOf="@+id/indicatorsContainer"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        tools:layout_editor_absoluteX="0dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

License
-------

    Copyright 2022 - 2023 Jeffrey Larbi-Akor

    Licensed under the iSpace Foundation, Apache License Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at iSpace Foundation

