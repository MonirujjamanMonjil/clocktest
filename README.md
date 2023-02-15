![This is an image](https://techeasylife.com/test/Screenshot_20230215_210515.jpg)





# MainActivity.xml








```ruby

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout

        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:orientation="vertical"
        android:gravity="center"


        android:background="#009688"

        >

        <TextClock
            android:gravity="center"
            android:id="@+id/textClock"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="40sp"

            android:format12Hour="hh:mm:ss a"

            android:textStyle="bold"
            android:textColor="#FF4F4F"
            android:shadowColor="@color/text_shadow_white"
            android:shadowDx="-2"

            android:shadowDy="-2"
            android:shadowRadius="1"
            />



        <!--<TextClock
            android:id="@+id/banglaTextClock"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="24sp"
            android:gravity="center"
            android:format12Hour="hh:mm:ss a"
            android:textColor="@color/black"
            android:fontFamily="@font/a"/>-->



        <TextView
            android:layout_marginTop="10dp"
            android:id="@+id/banglaTextClock"
            android:layout_width="wrap_content"
            android:gravity="center"
            android:layout_height="wrap_content"
            android:textSize="24sp"

            android:fontFamily="@font/a"
            android:shadowColor="#000000"
            android:textStyle="bold"
            android:textColor="@color/light_font"

            android:shadowDx="1"
            android:shadowDy="1"
            android:shadowRadius="2"
            />

        <TextClock
            android:layout_marginTop="30dp"
            android:id="@+id/banglaTextClock2"
            android:layout_width="wrap_content"
            android:gravity="center"
            android:layout_height="wrap_content"
            android:textSize="40sp"
            android:fontFamily="@font/f"
            android:shadowColor="#000000"
            android:textStyle="bold"
            android:textColor="@color/light_font"

            android:format12Hour="  hh:mm:ss a "
            android:shadowDx="1"
            android:shadowDy="1"
            android:shadowRadius="2"
            />


    </LinearLayout>

   <!-- <TextView android:id="@+id/txt_example1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="14sp"
        android:textStyle="bold"
        android:textColor="@color/light_font"
        android:shadowColor="@color/text_shadow"
        android:shadowDx="1"
        android:shadowDy="1"
        android:text="Hello World"
        android:shadowRadius="2" />



    <TextView android:id="@+id/txt_example2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="14sp"
        android:textStyle="bold"
        android:textColor="@color/light_font"
        android:shadowColor="@color/text_shadow"
        android:shadowDx="-1"
        android:shadowDy="-1"
        android:text="Hello World"
        android:shadowRadius="1" />


    <TextView android:id="@+id/txt_example3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        android:textSize="14sp"

        android:textStyle="bold"
        android:textColor="@color/grey_font"
        android:shadowColor="@color/text_shadow_white"
        android:shadowDx="-2"

        android:shadowDy="-2"
        android:shadowRadius="1"
        android:text="Hello World"/>

        -->

   <!-- <Button
        android:id="@+id/Button"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:text="next"
        >

    </Button>
    -->



</LinearLayout>



#Color.xml


<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>



    <color name="light_font">#FBFBFB</color>
    <color name="grey_font">#ff9e9e9e</color>
    <color name="text_shadow">#7F000000</color>
    <color name="text_shadow_white">#FFFFFF</color>

</resources>









#Strings


<resources>
    <string name="app_name">Clock Test</string>
    <string-array name="english_months">
        <item>January</item>
        <item>February</item>
        <item>March</item>
        <item>April</item>
        <item>May</item>
        <item>June</item>
        <item>July</item>
        <item>August</item>
        <item>September</item>
        <item>October</item>
        <item>November</item>
        <item>December</item>
    </string-array>

    <string-array name="bangla_months">
        <item>জানুয়ারি</item>
        <item>ফেব্রুয়ারি</item>
        <item>মার্চ</item>
        <item>এপ্রিল</item>
        <item>মে</item>
        <item>জুন</item>
        <item>জুলাই</item>
        <item>আগস্ট</item>
        <item>সেপ্টেম্বর</item>
        <item>অক্টোবর</item>
        <item>নভেম্বর</item>
        <item>ডিসেম্বর</item>
    </string-array>





</resources>




















```
