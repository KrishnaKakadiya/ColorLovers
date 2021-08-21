package com.krishna.myapplication.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RGB implements Serializable {

    @SerializedName("red")
    private int red;

    @SerializedName("green")
    private int green;

    @SerializedName("blue")
    private int blue;

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
