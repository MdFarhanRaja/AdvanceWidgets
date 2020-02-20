package com.farhan.advancewidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.farhan.widgets.AdvanceRelativeLayout;

public class MainActivity extends AppCompatActivity {

    AdvanceRelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=findViewById(R.id.rl);
        relativeLayout.setBorderColor(50,getResources().getColor(R.color.colorPrimary));
    }
}
