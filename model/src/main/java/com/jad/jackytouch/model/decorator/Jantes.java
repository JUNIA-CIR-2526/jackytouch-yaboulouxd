package com.jad.jackytouch.model.decorator;

import com.jad.jackytouch.model.Model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Jantes extends Model {
    @Override
    public String getCarRims(){
        String resourcePath = "/rims.txt";
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
    public String getMessagePerformance(){return "accélération améliorée.";}
    @Override
    public String getMessageLowCost(){return "aucun effet.";}
    @Override
    public String getMessageShowOff(){return "bruit distinctif.";}
}
