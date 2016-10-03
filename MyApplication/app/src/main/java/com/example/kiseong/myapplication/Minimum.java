package com.example.kiseong.myapplication;

/**
 * Created by kiseong on 2016-10-03.
 */
public class Minimum extends Value {
    public int Result()
    {

        int min = 0;

        for(int i = 0; i <a.length; i++){
            if(min<a[i]) {
             min = a[i];
        }

        }
        return min;
    }


}
