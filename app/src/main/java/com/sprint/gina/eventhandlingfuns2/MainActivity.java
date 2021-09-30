package com.sprint.gina.eventhandlingfuns2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    public static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.buttonLogin);

        // our goal: is to have code execute when the user presses the button
        // we will use "callbacks" to do this
        // 2 ways to listen for a click event
        // 1. define a method in MainActivity, then set the android:onClick attribute
        // for the button to that method's name
        // 2. define a class that implements the View.OnClickListener interface
        // register an object of that class as the button's listener
        // a few way to do 2.
        // 2.A. have MainActivity implement View.OnClickListener
//        loginButton.setOnClickListener(this);
        // 2.B. define another class (outer or nested) to implement the interface
        // anonymous class 2.C. define an anonymous View.OnClickListener (preferred approach)
        loginButton.setOnClickListener(new View.OnClickListener() { // can be shortened with lambda expression
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onLoginButtonClick: button clicked!! (2.C)");
                // task: on button click, grab the two edittexts' strings
                // print then to log cat
                // clear out the editexts
            }
        });
    }

    // 2.A.
//    @Override
//    public void onClick(View v) {
//        Log.d(TAG, "onLoginButtonClick: button clicked!! (2.A)");
//    }


    // 1.
//    public void onLoginButtonClick(View view) {
//        Log.d(TAG, "onLoginButtonClick: button clicked!! (1.)");
//    }
}