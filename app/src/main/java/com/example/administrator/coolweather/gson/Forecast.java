package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/10/27 0027.
 */

public class Forecast {
    public String date;

    @SerializedName("tem")
    public Temperature  temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_id")
        public String info;
    }

}
