package com.krishna.myapplication.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HSV implements Serializable {

    @SerializedName("hue")
    private int hue;

    @SerializedName("saturation")
    private int saturation;

    @SerializedName("value")
    private int value;

    public int getHue() {
        return hue;
    }

    public int getSaturation() {
        return saturation;
    }

    public int getValue() {
        return value;
    }
}
