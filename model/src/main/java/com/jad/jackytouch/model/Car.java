package com.jad.jackytouch.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.jad.jackytouch.common.IModel;

public class Car implements IModel {
    private List<AbstractDecorator> tunings = new ArrayList<>();

    @Override
    public String getCarBase() {
        String resourcePath = "/car_base.txt";
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
    public List<String> getTunings(){
        List<String> tuningDesigns = new ArrayList<>();
        for (AbstractDecorator tuning : tunings){
            tuningDesigns.add(tuning.getTuning());
        }
        return tuningDesigns;
    }

    @Override
    public List<String> getDescs(){
        List<String> descriptions = new ArrayList<>();
        for (AbstractDecorator tuning : tunings){
            descriptions.add(tuning.getDescription());
        }
        return descriptions;
    }

    @Override
    public void addTuning(int i){
        if (i == 1){
            Exhaust1 tuning = new Exhaust1();
            tunings.add(tuning);
        }
        else if(i == 2){
            Exhaust2 tuning = new Exhaust2();
            tunings.add(tuning);
        }
        else if(i == 3){
            Exhaust3 tuning = new Exhaust3();
            tunings.add(tuning);
        }
        else if(i == 4){
            Neons1 tuning = new Neons1();
            tunings.add(tuning);
        }
        else if(i == 5){
            Neons2 tuning = new Neons2();
            tunings.add(tuning);
        }
        else if(i == 6){
            Neons3 tuning = new Neons3();
            tunings.add(tuning);
        }
        else if(i == 7){
            Rims1 tuning = new Rims1();
            tunings.add(tuning);
        }
        else if(i == 8){
            Rims2 tuning = new Rims2();
            tunings.add(tuning);
        }
        else if(i == 9){
            Rims3 tuning = new Rims3();
            tunings.add(tuning);
        }
        else if(i == 10){
            Spoiler1 tuning = new Spoiler1();
            tunings.add(tuning);
        }
        else if(i == 11){
            Spoiler2 tuning = new Spoiler2();
            tunings.add(tuning);
        }
        else if(i == 12){
            Spoiler3 tuning = new Spoiler3();
            tunings.add(tuning);
        }
    }
}
