package com.sheygam.java_19_01_06_18;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyModule.class,StoreModule.class})
public interface MyComponent {
    void inject(MainActivity activity);
    void injectToSecondActivity(SecondActivity activity);
}
