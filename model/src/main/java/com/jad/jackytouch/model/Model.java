package com.jad.jackytouch.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.jad.jackytouch.common.IModel;
import com.sun.tools.javac.Main;

public class Model implements IModel {
    //Getter des fichiers txt
    @Override
    public String getCarBase() {
        String resourcePath = "/car_base.txt";
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
    public String getExhaust() {
        return "";
    }

    @Override
    public String getCarNeon() {
        return "";
    }

    @Override
    public String getCarRims() {
        return "";
    }

    @Override
    public String getCarSpoiler() {
        return "";
    }

    //Getter des messages des réglages mécaniques
    //Spoiler
    @Override
    public String getMessageEsthetique(){return "";}
    @Override
    public String getMessageAerodynamique(){return "";}
    @Override
    public String getMessageExagere(){return "";}
    //Neons
    @Override
    public String getMessageSobre(){return "";}
    @Override
    public String getMessageDisco(){return "";}
    @Override
    public String getMessageAleatoire(){return "";}
    //Jantes
    @Override
    public String getMessagePerformance(){return "";}
    @Override
    public String getMessageLowCost(){return "";}
    @Override
    public String getMessageShowOff(){return "";}
    //Exhaust
    @Override
    public String getMessageDiscret(){return "";}
    @Override
    public String getMessageSport(){return "";}
    @Override
    public String getMessageDrag(){return "";}
}
