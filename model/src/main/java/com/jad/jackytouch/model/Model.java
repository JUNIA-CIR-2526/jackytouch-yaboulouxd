package com.jad.jackytouch.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.jad.jackytouch.common.IModel;

public class Model implements IModel {
    @Override
    public String getCarBase() throws IOException{
        return Files.readString(Path.of("ressources/car_base.txt"));
    }

    @Override
    public String getExhaust() throws IOException{
        return Files.readString(Path.of("ressources/exhaust.txt"));
    }

    @Override
    public String getCarNeon() throws IOException{
        return Files.readString(Path.of("ressources/neon.txt"));
    }

    @Override
    public String getCarRims() throws IOException{
        return Files.readString(Path.of("ressources/rims.txt"));
    }

    @Override
    public String getCarSpoiler() throws IOException{
        return Files.readString(Path.of("ressources/spoiler.txt"));
    }
}
