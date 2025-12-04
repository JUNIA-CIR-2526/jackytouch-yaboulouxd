package com.jad.jackytouch.controller;

import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;

import java.io.IOException;

public class Controller implements IController {
    private IView view;
    private IModel model;

    @Override
    public void setView(IView view){
        this.view=view;
    }

    @Override
    public void proceed() throws IOException {
        this.view.displayCarBase(this.model.getCarBase());
    }

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }
}
