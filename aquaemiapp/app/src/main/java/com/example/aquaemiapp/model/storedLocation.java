package com.example.aquaemiapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.aquaemiapp.ui.home.wqiModel;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

@Entity(tableName = "storedLocations")
public class storedLocation {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name= "sever_id")
    public int serverId;

    @ColumnInfo(name= "name")
    public String Name;

    @ColumnInfo(name= "location")
    public String Location;

    @ColumnInfo(name= "display", index = true)
    public boolean displayed;
    public static JSONObject getJSON(URL url) throws IOException, JSONException {
        JSONObject json; json= new JSONObject(IOUtils.toString(url, Charset.forName("UTF-8")));
        return json;
    }
}