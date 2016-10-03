package com.example.kiseong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button 평균값 = (Button) findViewById(R.id.event);
        Button 최솟값 = (Button) findViewById(R.id.event1);

        final Minimum min = new Minimum();
        final Average ave = new Average();


        평균값.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),String.valueOf(ave.Result()), Toast.LENGTH_SHORT).show();

            }
        });

        최솟값.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),String.valueOf(min.Result()) ,Toast.LENGTH_SHORT).show();
            }
                               }
        );
    }

}
