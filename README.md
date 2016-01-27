# PNEditText
一个增加正负按纽来加减数字输入的`EditText`。


##Demo

<a href="https://github.com/addcn/PNEditText/raw/master/docs/apk/pnedittext.latest.apk" title="Download PNEditText">Download APK</a>

<img src="https://raw.githubusercontent.com/addcn/PNEditText/master/docs/screenshot/qrcode.png"  width="200" heigit="200" alt="Download PNEditText"/></p>

##Screenshot

<img src="https://raw.githubusercontent.com/addcn/PNEditText/master/docs/screenshot/pnedittext.gif"  width="225" heigit="400" alt="PNEditText"/></p>


##Require 
- Android SDK minSdkVersion >= `8`
- 开发环境
    - JDK版本：`jdk1.7.0_75`
    - Android Studio版本：`1.5.1`



##Usage
1. Improt library:

```java

allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

dependencies {
    compile ''
}
```

2. example 

```java
<com.uedao.android.pnedittext.PNEditText
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_alignParentRight="true"
    android:layout_centerInParent="true"
    android:layout_centerVertical="true" />
```


##About me

- 微博[http://www.weibo.com/addcn](http://www.weibo.com/addcn)




