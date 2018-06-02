package com.sheygam.java_19_01_06_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    FakeProvider provider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App app = (App) getApplicationContext();
        app.getComponent().inject(this);
        setContentView(R.layout.activity_main);

        Log.d("MY_TAG", "onCreate: " + provider.getJson());
    }
}
