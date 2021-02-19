package com.sparta.week04.models;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class ItemDto {

    private String title;
    private String image;
    private int lprice;
    private String link;


    public ItemDto(JSONObject itemJson){
        this.title = itemJson.getString("title");
        this.image = itemJson.getString("image");
        this.lprice = itemJson.getInt("lprice");
        this.link = itemJson.getString("link");
    }

}
