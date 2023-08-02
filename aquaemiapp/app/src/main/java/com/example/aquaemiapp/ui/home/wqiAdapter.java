package com.example.aquaemiapp.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.example.aquaemiapp.R;
public class wqiAdapter extends RecyclerView.Adapter<wqiViewHolder> {
    private final ArrayList<wqiModel> wqilist;
    public wqiAdapter(ArrayList<wqiModel> ls){
        wqilist=ls;
    }
    // This method creates a new ViewHolder object for each item in the RecyclerView
    @Override
    public wqiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the layout for each item and return a new ViewHolder object
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wqi_item, parent, false);
        return new wqiViewHolder(itemView);
    }
    // This method returns the total
    // number of items in the data set
    @Override
    public int getItemCount() {
        return wqilist.size();
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    @Override
    public void onBindViewHolder(wqiViewHolder holder, int position) {
        wqiModel cur = wqilist.get(position);
        holder.Name.setText(cur.getName());
        holder.Location.setText(cur.getLocation());
        holder.pH.setText("pH: "+String.valueOf(cur.getpH()));
        holder.streamflow.setText("Stream-flow: "+ String.valueOf(cur.getStreamflow()));
        holder.temperature.setText(String.valueOf(cur.getTemp()) + "C");
        holder.turbidity.setText("TSS: "+ String.valueOf(cur.getTurbidity()));
        holder.update.setText("Last update: "+ (cur.getUpdate()).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        double index= calcIndex(cur);
        holder.Index.setText(String.valueOf(index));
        holder.Level.setText(getLevel(index));
        holder.LevelText.setText((getLevelText(index)));
        holder.image.setImageResource(R.drawable.ic_earth_24dp);


    }

    public String getLevel(double index){
        return (index >= 91) ? "Excellent Water" :
                index >= 71 ? "Good Water" :
                        index >= 51 ? "Average Water" :
                                index >= 26 ? "Fair Water" :
                                        "Poor Water";
    }
    public String getLevelText(double index) {
        return (index >= 91) ? "This water is very clean" :
                index >= 71 ? "This water is moderately clean" :
                        index >= 51 ? "This water is average quality" :
                                index >= 26 ? "This water is dirty" :
                                        "This water is unsafe";
    }
    public double calcIndex(wqiModel holder){
        double Itemp= 1;//(holder.getTemp()<= 20) ? 1: 1-holder.getTemp() +20;
        double Ibod= 22.5;
        double Itss= (holder.getTurbidity()<=100)? 25-0.15*holder.getTurbidity() :
                ((holder.getTurbidity()<=250)?17-0.07*holder.getTurbidity():0);
        double Ido= 20;
        double Iec=4.6;
        return (double) (Itemp*(Ibod +Itss + Ido + Iec));

    }


    // This class defines the ViewHolder object for each item in the RecyclerView

}