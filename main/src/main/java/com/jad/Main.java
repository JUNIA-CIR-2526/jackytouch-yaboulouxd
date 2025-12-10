package com.jad;

import com.jad.jackytouch.common.IBehavior;
import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;
import com.jad.jackytouch.controller.Controller;
import com.jad.jackytouch.model.Model;
import com.jad.jackytouch.model.Spoiler2;
import com.jad.jackytouch.view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IModel model = new Model();
        IController controller = new Controller();
        controller.setModel(model);
        IView view = new View();
        controller.setView(view);
        IBehavior cars = new Model();
        controller.proceed();

    }
}