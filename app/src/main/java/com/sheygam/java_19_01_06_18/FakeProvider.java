package com.sheygam.java_19_01_06_18;

public class FakeProvider {

    private SPrefStore store;

    public FakeProvider(SPrefStore store) {
        this.store = store;
    }

    public String getJson(){
        store.save();
        return "{\"name\":\"vasya\"}";
    }
}
