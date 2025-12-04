package com.jad.jackytouch.controller;

import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;

public class Controller implements IController {
    private IView view;
    private IModel model;

    @Override
    public void setView(final IView view) {this.view = view;}

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }

    
}
