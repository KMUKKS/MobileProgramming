package com.example.kiseong.myapplication;

/**
 * Created by kiseong on 2016-10-03.
 */
public class Average extends Value {
    @Override
    public int Result() {
        int result =0;

        for(int i =0;i < a.length;i++) {
            result += a[i];
        }
        result /= a.length;

        return result;
    }
}
