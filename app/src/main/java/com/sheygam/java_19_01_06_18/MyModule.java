package com.sheygam.java_19_01_06_18;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {



    @Provides
    @Singleton
    FakeProvider provideFakeProvider(SPrefStore store){
        return new FakeProvider(store);
    }
}
