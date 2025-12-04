package com.jad.jackytouch.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.jad.jackytouch.common.IModel;

public class Model implements IModel {
    //Getter des fichers txt
    @Override
    public String getCarBase() throws IOException{
        return Files.readString(Path.of("model/src/main/ressources/car_base.txt"));
    }

    @Override
    public String getExhaust() throws IOException{
        return Files.readString(Path.of("model/src/main/ressources/exhaust.txt"));
    }

    @Override
    public String getCarNeon() throws IOException{
        return Files.readString(Path.of("model/src/main/ressources/neon.txt"));
    }

    @Override
    public String getCarRims() throws IOException{
        return Files.readString(Path.of("model/src/main/ressources/rims.txt"));
    }

    @Override
    public String getCarSpoiler() throws IOException{
        return Files.readString(Path.of("model/src/main/ressources/spoiler.txt"));
    }

    //Getter des messages des réglages mécaniques
    //Spoiler
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
