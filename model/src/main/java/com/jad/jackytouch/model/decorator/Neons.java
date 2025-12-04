package com.jad.jackytouch.model.decorator;

import com.jad.jackytouch.model.Model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Neons extends Model {
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
    public String getMessageSobre(){return "lumière fixe.";}
    @Override
    public String getMessageDisco(){return "clignotement simulé.";}
    @Override
    public String getMessageAleatoire(){return "affichage imprévisible.";}
}
