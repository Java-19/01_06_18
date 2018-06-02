package com.sheygam.java_19_01_06_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    SPrefStore store;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.get().getComponent().injectToSecondActivity(this);
        setContentView(R.layout.activity_second);
    }
}
