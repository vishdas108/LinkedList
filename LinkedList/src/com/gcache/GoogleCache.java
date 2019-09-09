package com.gcache;


import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class GoogleCache <T>{
    private HashMap<Integer, T> data;
    private boolean xSecondsOver;
    private final int timeOut;

    public GoogleCache(int x) {
        data = new HashMap<>();
        xSecondsOver = false;
        timeOut = x;

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                xSecondsOver = true;
                data.clear();
            }
        }, x * 1000);
    }

    public boolean add(int key, T value) {
        if(!xSecondsOver) {
            data.put(key, value);
            return true;
        }
        return false;
    }

    public T retreive(int key) {
        return data.get(key);
    }

    public static void main(String[] args) {
        GoogleCache gc = new GoogleCache(10);
        gc.add(1, 1);
        gc.add(2, 2);
        gc.add(3, 3);

    }
}
