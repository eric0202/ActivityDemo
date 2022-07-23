package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("e","activity2 on start");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e("e","activity2 on resume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("e", "activity2 on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("e", "activity2 on destroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("e","activity2 on pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("e","activity2 on restart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("e",getClass().getSimpleName()+" activity2 on create");

        Button button1, button2, button3;
        button1 = findViewById(R.id.a2b1);
        button2 = findViewById(R.id.a2b2);
        button3 = findViewById(R.id.a2b3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}