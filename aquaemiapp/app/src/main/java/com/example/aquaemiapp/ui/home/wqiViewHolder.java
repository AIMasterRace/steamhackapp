package com.example.aquaemiapp.ui.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aquaemiapp.R;

public class wqiViewHolder extends RecyclerView.ViewHolder {
    TextView Name;
    TextView Location;
    TextView Level;
    TextView LevelText;
    TextView pH;
    TextView streamflow;
    TextView temperature;
    TextView turbidity;
    ImageView image;
    TextView update;
    TextView Index;
    View view;
    public wqiViewHolder(@NonNull View itemView) {
        super(itemView);
        Name= itemView.findViewById(R.id.wqiName);
        Location= itemView.findViewById(R.id.wqiLocation);
        Level= itemView.findViewById(R.id.wqiLevel);
        LevelText= itemView.findViewById(R.id.wqiLevelText);
        pH= itemView.findViewById(R.id.wqipH);
        streamflow= itemView.findViewById(R.id.wqistreamflow);
        temperature= itemView.findViewById(R.id.wqitemperature);
        turbidity= itemView.findViewById(R.id.wqiturbidity);
        update= itemView.findViewById(R.id.wqiupdate);
        Index= itemView.findViewById(R.id.wqiIndex);
        image = itemView.findViewById(R.id.wqiimage);
        view= itemView;
    }
}
