# iSpace Journal App

Evening Repository
------
Public repository
![TheMaster](https://github.com/Jeffreylarbiakor/IspaceAndroidEvening/blob/main/RecyclerViewAdapterEvening/Main-Activity.jpg)
![TheMaster](https://github.com/Jeffreylarbiakor/IspaceAndroidEvening/blob/main/RecyclerViewAdapterEvening/Image-Card-Layout-xml.jpg)


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
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
}
```

 Usage
-----
```xml
 <LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="5dp">

    <ImageView
        android:id="@+id/imageview"
        android:layout_width="120dp"
        android:layout_marginEnd="15dp"
        android:layout_height="120dp" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:text="Item"
        android:layout_marginTop="10dp"
        android:layout_gravity="center_horizontal"
        android:textSize="20sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/description"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="5dp"
        android:layout_marginTop="5dp"
        android:textSize="15sp"
        android:text="Description" />
		
```

License
-------

    Copyright 2022 - 2023 Jeffrey Larbi-Akor

    Licensed under the ispace fundation, Version 3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at iSpace Foundation

 
