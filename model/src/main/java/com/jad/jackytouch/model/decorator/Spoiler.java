package com.jad.jackytouch.model.decorator;

import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.model.Model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Spoiler extends Model {
    @Override
    public String getCarSpoiler(){
        String resourcePath = "/spoiler.txt";
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
    public String getMessageEsthetique(){return "aucun effet mécanique.";}
    @Override
    public String getMessageAerodynamique(){return "stabilité accrue.";}
    @Override
    public String getMessageExagere(){return "vitesse max réduite, effet visuel accentué.";}
}
