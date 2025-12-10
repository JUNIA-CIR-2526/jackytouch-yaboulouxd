package com.jad.jackytouch.controller;

import com.jad.jackytouch.common.IBehavior;

public abstract class AbstractCars implements IBehavior{
    private String tuning;
    private String description;

    public AbstractCars(String tuning, String description) {
        this.tuning = tuning;
        this.description = description;
    }

    @Override
    public String getTuning(){return this.getTuning();}

    @Override
    public String getDescription(){return this.getDescription();}
}
