package com.jad.jackytouch.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Exhaust3 extends AbstractDecorator {
    @Override
    public String getTuning(){
        String resourcePath = "/exhaust.txt";
        InputStream inputStream = Car.class.getResourceAsStream(resourcePath);
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
    public String getDescription(){return "bruit extrême.";}
}
