package com.example.camer.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMessages();
    }

    private void setupMessages() {
        // Get  a reference to button
        Button getTruth = (Button) findViewById(R.id.button_id);

        // set the click listener to run code
        getTruth.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // generate stuff
                TextView getTruth = (TextView) findViewById(R.id.Truth_text);
                getTruth.setText("Bush did 9/11 and Steve Jobs killed himself to sell more Ipods");
            }

        });
        }
}




