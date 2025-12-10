package com.jad.jackytouch.controller;

import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;

import java.util.ArrayList;
import java.util.List;

public class Controller implements IController {
    private IView view;
    private IModel model;
    private List<String> tunings = new ArrayList<>();
    private List<String> settings = new ArrayList<>();

    @Override
    public void setView(IView view){
        this.view=view;
    }

    @Override
    public void proceed() {
        this.view.displayCar(this.model.getCarBase(), tunings);
        for(String setting : settings){
            this.view.displaySettingMessage(setting);
        }
    }

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }
}
