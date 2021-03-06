package com.example.android.quakereport;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String mUrl;

    private static final String LOG_TAG = EarthquakeLoader.class.getName();


    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG,"Calling onStartLoading().....");
        forceLoad();
    }

    @Nullable
    @Override
    public List<Earthquake> loadInBackground() {
        Log.i(LOG_TAG,"Calling loadInBackground ().....");
        if (mUrl == null) {
            return null;
        }

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
