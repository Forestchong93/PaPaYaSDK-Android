# PaPaYaSDK-android

## Android PaPaYaSDK Setup Guide

#### Step 1
  Add below in `Project build.gradle` 

```sh
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

#### Step 2
  Add below in `App build.gradle`
```sh
implementation 'com.github.Forestchong93:PaPaYaSDK-android:0.0.1'
```

#### Step 3
  Add below in your `XML layout`
```sh
  <com.bubblespot.papayaadssdk.views.Banner
      android:layout_width="wrap_content"
      android:layout_height="wrap_content">
  </com.bubblespot.papayaadssdk.views.Banner>
```
![alt text](https://github.com/Forestchong93/PaPaYaSDK-android/blob/master/Screenshot_1561967266.png)


# Additional Information to take note:

1."minSdkVersion" should be 23 and above

2.If use Constraint Layout, please add the following under the Banner. 
```sh
  app:layout_constraintBottom_toBottomOf="parent"
  app:layout_constraintLeft_toLeftOf="parent"
  app:layout_constraintRight_toRightOf="parent"
```

Example as follow:
```sh
  <android.support.constraint.ConstraintLayout 
      xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      xmlns:tools="http://schemas.android.com/tools"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      tools:context=".MainActivity">

  <com.bubblespot.papayaadssdk.views.Banner
      app:layout_constraintBottom_toBottomOf="parent"
      app:layout_constraintLeft_toLeftOf="parent"
      app:layout_constraintRight_toRightOf="parent"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content">
  </com.bubblespot.papayaadssdk.views.Banner>

  </android.support.constraint.ConstraintLayout>
```
3.The location for the banners folder is: PapayaAdsSdk -> src -> main -> res -> drawable

## And You're good to Go!!
