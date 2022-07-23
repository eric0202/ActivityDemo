package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("e","activity1 on start");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e("e","activity1 on resume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("e", "activity1 on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("e", "activity1 on destroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("e","activity1 on pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("e","activity1 on restart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("e", getClass().getSimpleName()+" activity1 on create");



        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.baidu.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });



    }


}