package com.sheygam.java_19_01_06_18;

import android.app.Application;

public class App extends Application{
    private MyComponent component;
    private static App app;

    public static App get(){
        return app;
    }

    public App() {
        app = this;
    }

    @Override
    public void onCreate() {
        component = DaggerMyComponent.builder()
                .myModule(new MyModule())
                .build();
        super.onCreate();
    }

    public MyComponent getComponent() {
        return component;
    }
}
