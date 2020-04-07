package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class RealTimeResponse(val status:String,val result: Result) {

    data class Result(val realtime:Realtime)

    data class Realtime(val skycon:String,val temperature:Float, @SerializedName("air_quality")val airQuality:AitQuality)

    data class AitQuality(val aqi :AQI)

    data class AQI(val chn:String)
}