package com.example.aquaemiapp;

import com.example.aquaemiapp.model.AppDatabase;
import com.example.aquaemiapp.model.storedLocation;
import com.example.aquaemiapp.model.storedLocationDao;
import com.example.aquaemiapp.ui.home.wqiModel;

import org.json.JSONException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static AppDatabase db;

    public static ArrayList<wqiModel> getsamplewqiData()
    {
        // create an ArrayList of type wqiModel class
        ArrayList<wqiModel> wqiModelList
                = new ArrayList<wqiModel>();
        wqiModel emp1 = new wqiModel(7.1, (double) 150, (double) 2000, (double) 25, (double) 200, "Saigon River", "Ho Chi Minh, Vietnam",
                LocalDateTime.now());
        wqiModelList.add(emp1);
        wqiModel emp2
                = new wqiModel(7.3, (double) 100, (double) 2000, (double) 28, (double) 200, "Hanoi River", "Ha Noi, Vietnam",
                LocalDateTime.now());
        wqiModelList.add(emp2);

        return wqiModelList;
    }

    public ArrayList<wqiModel> getServerwqiData() throws JSONException, IOException {
        storedLocationDao sLDao = db.storedLocationDao();
        List<storedLocation> sLs = sLDao.getAll();
        ArrayList<wqiModel> arr= new ArrayList<wqiModel>();
        for (storedLocation sL : sLs){
            arr.add(new wqiModel(sL.getJSON(getURL(sL.serverId))));
        }
        return arr;
    }
    public URL getURL(int serverId) throws MalformedURLException {
        return new URL(String.valueOf(1));
    }
}