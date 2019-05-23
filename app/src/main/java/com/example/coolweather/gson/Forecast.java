package com.example.coolweather.gson;

        /*
         *   "daily_forecast":
         *       [
         *           {
         *               "date":"2019-05-19",
         *               "cond":{"txt_d":"多云"},
         *               "tmp":{"max":"20","min":"11"}
         *           },
         *           {
         *               "date":"2019-05-20",
         *               "cond":{"txt_d":"多云"},
         *               "tmp":{"max":"18","min":"7"}
         *           },
         *           {
         *               "date":"2019-05-21",
         *               "cond":{"txt_d":"晴"},
         *               "tmp":{"max":"16","min":"6"}
         *           },
         *           {"date":"2019-05-22","cond":{"txt_d":"多云"},"tmp":{"max":"20","min":"11"}},
         *           {"date":"2019-05-23","cond":{"txt_d":"多云"},"tmp":{"max":"18","min":"7"}},
         *           {"date":"2019-05-24","cond":{"txt_d":"晴"},"tmp":{"max":"16","min":"6"}}],
         * */
import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
