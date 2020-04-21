package com.example.assignment;

import android.graphics.Movie;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class movie implements Serializable {
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("Top-Rated")
    private String toprated;

    public movie(double popularity,String toprated){
        this.popularity = popularity;
        this.toprated = toprated;
    }
    public double getPopularity(){
        return popularity;
    }
    public void setToprated(){
        this.toprated = toprated;
    }
    @SuppressWarnings("ALL")
    public class MoviePageResult implements Serializable {
        @SerializedName("page")
        private int page;
        @SerializedName("total_results")
        private int totalResults;
        @SerializedName("total_pages")
        private int totalPages;
        @SerializedName("results")
        private ArrayList<Movie> movieResult;
    }
}
