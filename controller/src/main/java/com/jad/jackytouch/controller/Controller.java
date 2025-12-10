package com.jad.jackytouch.controller;

import com.jad.jackytouch.common.IBehavior;
import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;
import com.jad.jackytouch.model.Model;
import com.jad.jackytouch.model.Spoiler1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller implements IController {
    private IView view;
    private IModel model;
    private List<String> tunings = new ArrayList<>();
    IBehavior cars = new Model();

    @Override
    public void setView(IView view){
        this.view=view;
    }

    @Override
    public void proceed() throws IOException {
        this.view.display(this.model.getCarBase());
        this.view.displayCar(this.model.getCarBase(), tunings);
    }

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }

    void addTuning(String tuning){
        cars = new Spoiler1();
    }

}
