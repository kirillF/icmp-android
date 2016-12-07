package com.github.kirillf.icmptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int res = pingJNI("8.8.8.8", 5);
        Log.d("MainActivity", "Ping res: " + res);
    }

    public native int pingJNI(String host, int count);

    static {
        System.loadLibrary("icmpnative");
    }
}
