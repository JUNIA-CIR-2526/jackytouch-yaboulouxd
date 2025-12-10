package com.jad;

import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;
import com.jad.jackytouch.controller.Controller;
import com.jad.jackytouch.model.Car;
import com.jad.jackytouch.view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IModel model = new Car();
        IController controller = new Controller();
        controller.setModel(model);
        IView view = new View();
        View cars = new View();
        controller.setView(view);
        controller.proceed();
    }

}