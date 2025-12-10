package com.jad.jackytouch.model;

import com.jad.jackytouch.common.IBehavior;

abstract public class AbstractDecorator implements IBehavior {
    @Override
    public String getCarBase(){
        return this.getCarBase();
    }

    @Override
    public String getTuning(){
        return this.getTuning();
    }

    @Override
    public String getDescription(){
        return this.getDescription();
    }
}
