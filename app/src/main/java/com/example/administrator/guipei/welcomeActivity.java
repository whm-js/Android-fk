package com.example.administrator.guipei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class welcomeActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT = 1000; // 两秒后进入系统
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new android.os.Handler().postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(welcomeActivity.this,
                        MainActivity.class);
                welcomeActivity.this.startActivity(mainIntent);
                welcomeActivity.this.finish();
            }

        }, SPLASH_DISPLAY_LENGHT);
    }
}
