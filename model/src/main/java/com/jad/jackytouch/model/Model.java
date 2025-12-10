package com.jad.jackytouch.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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
    public String getCarNeon(){
        String resourcePath = "/neon.txt";
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

    //Getter des noms des réglages mécaniques
    //Spoiler
    @Override
    public String getNameEsthetique(){return "Esthétique";}
    @Override
    public String getNameAerodynamique(){return "Aérodynamique";}
    @Override
    public String getNameExagere(){return "Exagéré";}
    //Neons
    @Override
    public String getNameSobre(){return "Sobre";}
    @Override
    public String getNameDisco(){return "Disco";}
    @Override
    public String getNameAleatoire(){return "Aléatoire";}
    //Jantes
    @Override
    public String getNamePerformance(){return "Performance";}
    @Override
    public String getNameLowCost(){return "Low-cost";}
    @Override
    public String getNameShowOff(){return "Show off";}
    //Exhaust
    @Override
    public String getNameDiscret(){return "Silencieux";}
    @Override
    public String getNameSport(){return "Sport";}
    @Override
    public String getNameDrag(){return "Drag";}

    //Getter des messages des reglages
    @Override
    public String getMessageEsthetique(){return "aucun effet mécanique.";}
    @Override
    public String getMessageAerodynamique(){return "stabilité accrue.";}
    @Override
    public String getMessageExagere(){return "vitesse max réduite, effet visuel accentué.";}
    //Neons
    @Override
    public String getMessageSobre(){return "lumière fixe.";}
    @Override
    public String getMessageDisco(){return "clignotement simulé.";}
    @Override
    public String getMessageAleatoire(){return "affichage imprévisible.";}
    //Jantes
    @Override
    public String getMessagePerformance(){return "accélération améliorée.";}
    @Override
    public String getMessageLowCost(){return "aucun effet.";}
    @Override
    public String getMessageShowOff(){return "bruit distinctif.";}
    //Exhaust
    @Override
    public String getMessageDiscret(){return "bruit discret.";}
    @Override
    public String getMessageSport(){return "bruit puissant.";}
    @Override
    public String getMessageDrag(){return "bruit extrême.";}
}
