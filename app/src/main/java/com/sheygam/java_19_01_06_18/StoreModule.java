package com.sheygam.java_19_01_06_18;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StoreModule {
    @Provides
    @Singleton
    SPrefStore provideSprefStore(){
        return new SPrefStore();
    }
}
