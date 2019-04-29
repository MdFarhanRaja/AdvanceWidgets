# AdvanceWidgets
Customized views like TextView, Edittext, Layouts,RoundImageView, Zoom ImageView etc.

How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.MdFarhanRaja:AdvanceWidgets:1.2'
	}
  



# AdvanceTextView

![Screenshot_20190429_130224](https://user-images.githubusercontent.com/18304656/56882714-0c875800-6a82-11e9-8f67-4b6037a17570.jpg)

    <com.farhan.widgets.AdvanceTextView
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:gravity="center"
        android:text="With Corner Radius"
        app:atv_borderColor="@color/colorAccent"
        app:atv_borderEnable="true"
        app:atv_borderWidth="1.5dp"
        app:atv_cornerRadius="5dp"
        app:textAllCaps="false" />

    <com.farhan.widgets.AdvanceTextView
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:layout_marginTop="30dp"
        android:gravity="center"
        android:text="With Custom Corner Radius"
        app:atv_borderColor="@color/colorAccent"
        app:atv_borderEnable="true"
        app:atv_borderWidth="1.5dp"
        app:atv_bottomLeftCornerRadius="5dp"
        app:atv_bottomRightCornerRadius="5dp"
        app:atv_customCornerRadius="true" />

    <com.farhan.widgets.AdvanceTextView
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:layout_marginTop="30dp"
        android:gravity="center"
        android:text="With Custom Font"
        app:atv_borderColor="@color/colorAccent"
        app:atv_borderEnable="true"
        app:atv_borderWidth="1.5dp"
        app:atv_bottomLeftCornerRadius="50dp"
        app:atv_customCornerRadius="true"
        app:atv_fontPath="good_times.ttf"
        app:atv_topLeftCornerRadius="50dp" />
	
All Attributes:

        app:atv_cornerRadius=dimention
        app:atv_borderEnable=boolean
        app:atv_borderColor=color
        app:atv_borderWidth=dimention
        app:atv_backgroundColor=color
        app:atv_fontPath=font path with extention
        app:atv_customCornerRadius=boolean
        app:atv_topLeftCornerRadius=dimention
        app:atv_topRightCornerRadius=dimention
        app:atv_bottomLeftCornerRadius=dimention
        app:atv_bottomRightCornerRadius=dimention


# AdvanceEditText

![Screenshot_20190429_130210](https://user-images.githubusercontent.com/18304656/56882851-80296500-6a82-11e9-9cf2-0ccf8a23120a.jpg)


    <com.farhan.widgets.AdvanceEditText
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:gravity="center"
        android:text="With Corner Radius"
        app:aet_borderColor="@color/colorAccent"
        app:aet_borderEnable="true"
        app:aet_borderWidth="1.5dp"
        app:aet_cornerRadius="5dp"
        app:textAllCaps="false" />

    <com.farhan.widgets.AdvanceEditText
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:layout_marginTop="30dp"
        android:gravity="center"
        android:text="With Custom Corner Radius"
        app:aet_borderColor="@color/colorAccent"
        app:aet_borderEnable="true"
        app:aet_borderWidth="1.5dp"
        app:aet_bottomLeftCornerRadius="5dp"
        app:aet_bottomRightCornerRadius="5dp"
        app:aet_customCornerRadius="true" />

    <com.farhan.widgets.AdvanceEditText
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:layout_marginTop="30dp"
        android:gravity="center"
        android:text="With Custom Font"
        app:aet_borderColor="@color/colorAccent"
        app:aet_borderEnable="true"
        app:aet_borderWidth="1.5dp"
        app:aet_bottomLeftCornerRadius="50dp"
        app:aet_customCornerRadius="true"
        app:aet_fontPath="good_times.ttf"
        app:aet_topLeftCornerRadius="50dp" />
	
All Attributes:

	app:aet_cornerRadius=dimention
	app:aet_borderEnable=boolean
	app:aet_borderColor=color
	app:aet_borderWidth=dimention
	app:aet_backgroundColor=color
	app:aet_fontPath=font path with extention
	app:aet_customCornerRadius=boolean
	app:aet_topLeftCornerRadius=dimention
	app:aet_topRightCornerRadius=dimention
	app:aet_bottomLeftCornerRadius=dimention
	app:aet_bottomRightCornerRadius=dimention

# AdvanceLinearLayout

![Screenshot_20190429_130156](https://user-images.githubusercontent.com/18304656/56882849-7f90ce80-6a82-11e9-9628-f37686d7ca08.jpg)

    <com.farhan.widgets.AdvanceLinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:orientation="vertical"
        app:all_borderColor="@color/colorAccent"
        app:all_borderEnable="true"
        app:all_borderWidth="1.5dp"
        app:all_cornerRadius="5dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:text="Linear Layout" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:text="Linear Layout" />

    </com.farhan.widgets.AdvanceLinearLayout>
    
All Attributes:

        app:all_cornerRadius=dimention
        app:all_borderEnable=boolean
        app:all_borderColor=color
        app:all_borderWidth=dimention
        app:all_backgroundColor=color
        app:all_customCornerRadius=boolean
        app:all_topLeftCornerRadius=dimention
        app:all_topRightCornerRadius=dimention
        app:all_bottomLeftCornerRadius=dimention
        app:all_bottomRightCornerRadius=dimention

# AdvanceRalativeLayout

![Screenshot_20190429_130141](https://user-images.githubusercontent.com/18304656/56882852-80296500-6a82-11e9-8757-e6dcae2b4221.jpg)

     <com.farhan.widgets.AdvanceRelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:arl_borderColor="@color/colorAccent"
        app:arl_borderEnable="true"
        app:arl_borderWidth="1.5dp"
        app:arl_cornerRadius="5dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:padding="10dp"
            android:text="Relative Layout" />

    </com.farhan.widgets.AdvanceRelativeLayout>
    
 All Attributes:

        app:arl_cornerRadius=dimention
        app:arl_borderEnable=boolean
        app:arl_borderColor=color
        app:arl_borderWidth=dimention
        app:arl_backgroundColor=color
        app:arl_customCornerRadius=boolean
        app:arl_topLeftCornerRadius=dimention
        app:arl_topRightCornerRadius=dimention
        app:arl_bottomLeftCornerRadius=dimention
        app:arl_bottomRightCornerRadius=dimention
	
	
# ZoomImageView

![ezgif com-video-to-gif](https://user-images.githubusercontent.com/18304656/56883646-eadba000-6a84-11e9-8a82-56498b09efed.gif)

    <com.farhan.widgets.ZoomImageView
        android:src="@drawable/image_"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
	
You can load images using glide also....

