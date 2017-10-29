package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/10/27 0027.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("coud")
    public More more;

    public class More {
        @SerializedName("TEXT")
        public String info;
    }
}
