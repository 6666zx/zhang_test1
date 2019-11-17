package com.Current;

import java.util.concurrent.ConcurrentHashMap;

public class CurrentTest {
    public void current1Test(){
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
        map.put("1","11");
    }
}
