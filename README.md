# PaPaYaSDK-android

## Android PaPaYaSDK Setup Guide

#### Step 1
  Add  `maven { url 'https://jitpack.io' }` in `Project build.gradle` 

```sh
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

#### Step 2
  Add `implementation 'com.github.Forestchong93:PaPaYaSDK-android:0.0.1'` in `App build.gradle`
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


## And You good to Go!!
