package com.krishna.myapplication.models;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ColourLovers implements Serializable {

    @SerializedName("id")
    private int id;

    @SerializedName("numViews")
    private int numViews;

    @SerializedName("numVotes")
    private int numVotes;

    @SerializedName("numComments")
    private int numComments;

    @SerializedName("numHearts")
    private int numHearts;

    @SerializedName("rank")
    private int rank;

    @SerializedName("title")
    private String title;

    @SerializedName("userName")
    private String userName;

    @SerializedName("dateCreated")
    private String dateCreated;

    @SerializedName("hex")
    private String hex;

    @SerializedName("description")
    private String description;

    @SerializedName("url")
    private String url;

    @SerializedName("imageUrl")
    private String imageUrl;

    @SerializedName("badgeUrl")
    private String badgeUrl;

    @SerializedName("apiUrl")
    private String apiUrl;

    @SerializedName("rgb")
    private List<RGB> rgb;

    @SerializedName("hsv")
    private List<HSV> hsv;

    public int getId() {
        return id;
    }

    public int getNumViews() {
        return numViews;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public int getNumComments() {
        return numComments;
    }

    public int getNumHearts() {
        return numHearts;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getUserName() {
        return userName;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getHex() {
        return hex;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public List<RGB> getRgb() {
        return rgb;
    }

    public List<HSV> getHsv() {
        return hsv;
    }

    @BindingAdapter("android:loadColourImage")
    public void loadColourImage(ImageView imageView,String imageUrl){
        Glide.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }
}
