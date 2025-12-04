package com.jad.jackytouch.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.jad.jackytouch.common.IModel;

public class Model implements IModel {
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
}
