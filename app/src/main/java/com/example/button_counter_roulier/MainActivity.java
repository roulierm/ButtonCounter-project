package com.example.button_counter_roulier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String TAG="MainActivity";
    Button buttonIncrement;
    Button buttonDecrement;
    Button buttonReset;
    TextView textView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIncrement = findViewById(R.id.button1);
        buttonDecrement = findViewById(R.id.button2);
        buttonReset = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(count + " clicks");
                Log.i(TAG, "****I clicked the button****");
            }
        });
        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                textView.setText(count + " clicks");
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                textView.setText(count + " clicks");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"I entered into onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"I entered into onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"I entered into onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"I entered into onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"I entered into onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"I entered into onDestroy");
    }
}