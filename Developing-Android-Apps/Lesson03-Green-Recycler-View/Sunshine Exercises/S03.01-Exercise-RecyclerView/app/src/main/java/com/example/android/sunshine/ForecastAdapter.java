package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rohit on 14/08/17.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{

    private String[] mweatherData;

    public ForecastAdapter(){

    }
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // get the current context
        Context context = parent.getContext();
        // list item which is selected
        int layoutIdItem = R.layout.forecast_list_item;

        // inflate layout using LayoutInflater
        LayoutInflater inflater = LayoutInflater.from(context);
        // add boolean to prevent immediate inflate
        boolean preventImmediateInflate = false;
        View view = inflater.inflate(layoutIdItem,parent,preventImmediateInflate);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String weatherDisplay = mweatherData[position];
        holder.mWeatherTextView.setText(weatherDisplay);
    }

    @Override
    public int getItemCount() {
        if(mweatherData == null)
            return 0;
        return mweatherData.length;
    }
     void setWeatherData(String [] weatherData) {

        mweatherData = weatherData;
        notifyDataSetChanged();
    }
    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;
        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }

}
