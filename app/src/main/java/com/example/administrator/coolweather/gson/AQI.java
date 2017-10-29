package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2017/10/27 0027.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String api;

        public String pm25;
    }
}
