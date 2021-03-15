package com.example.acitvilifecyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView OnCreate,OnStart,OnResume,OnRestart;
    private Button tvBtnStart;
    private int create=0,start=0,resume=0,restart=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create++;
        OnCreate=findViewById(R.id.OnCreate);
        OnCreate.setText("OnCreate() Calls"+create);
        Log.i("LifeCycleinterface","OnCreate is Called");
        tvBtnStart=findViewById(R.id.tvBtnstart);
        tvBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        start++;
        OnStart=findViewById(R.id.OnStart);
        OnStart.setText("OnStart() calls"+start);
        Log.i("LifeCycleInterface","OnStart is calls");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart++;
        OnRestart=findViewById(R.id.OnRestart);
        OnRestart.setText("OnRestart() calls"+restart);
        Log.i("LifeCycleInterface","OnRestart() is calls");

    }

    @Override
    protected void onResume() {
        super.onResume();
        resume++;
        OnResume=findViewById(R.id.OnResume);
        OnResume.setText("OnResume() calls"+resume);
        Log.i("LifeCycleInterface","OnResume() is calls");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycleInterface","OnPause() is calls");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycleInterface","OnDestroy() is calls");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycleInterface","OnStop() is calls");

    }
}