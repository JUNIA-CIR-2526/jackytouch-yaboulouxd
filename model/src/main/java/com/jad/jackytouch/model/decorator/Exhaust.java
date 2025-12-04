package com.jad.jackytouch.model.decorator;

import com.jad.jackytouch.model.Model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Exhaust extends Model{
    @Override
    public String getExhaust(){
        String resourcePath = "/exhaust.txt";
        InputStream inputStream = Model.class.getResourceAsStream(resourcePath);
        if (inputStream == null) {
            throw new IllegalArgumentException("File not found: " + resourcePath);
        }
        try {
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            return content;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getMessageDiscret(){return "bruit discret.";}
    @Override
    public String getMessageSport(){return "bruit puissant.";}
    @Override
    public String getMessageDrag(){return "bruit extrême.";}
}
