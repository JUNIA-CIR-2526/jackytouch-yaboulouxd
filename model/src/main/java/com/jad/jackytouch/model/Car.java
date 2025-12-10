package com.jad.jackytouch.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import com.jad.jackytouch.common.IModel;

public class Car implements IModel {
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
}
