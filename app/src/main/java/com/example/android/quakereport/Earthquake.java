package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMiliseconds;
    private String mUrl;



    public Earthquake(double magnitude, String location, long timeInMiliseconds, String url){
        mMagnitude= magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMiliseconds;
        mUrl = url;
    }

    public double getmMagnitude() {return mMagnitude;}

    public String getmLocation() {return mLocation;}

    public  long getmTimeInMiliseconds(){return mTimeInMiliseconds;}

    public String getmUrl() {return mUrl;}

}
