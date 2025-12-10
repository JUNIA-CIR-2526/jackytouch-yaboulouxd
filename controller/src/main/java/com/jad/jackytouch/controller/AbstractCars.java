package com.jad.jackytouch.controller;

import com.jad.jackytouch.common.IBehavior;

public abstract class AbstractCars implements IBehavior{
    private  String carBase;
    private String tuning;
    private String description;

    public AbstractCars(String carBase, String tuning, String description) {
        this.carBase = carBase;
        this.tuning = tuning;
        this.description = description;
    }

    @Override
    public String getCarBase() {return this.getCarBase();}

    @Override
    public String getTuning(){return this.getTuning();}

    @Override
    public String getDescription(){return this.getDescription();}
}
