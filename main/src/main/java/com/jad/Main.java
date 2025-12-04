package com.jad;

import com.jad.jackytouch.common.IController;
import com.jad.jackytouch.common.IModel;
import com.jad.jackytouch.common.IView;
import com.jad.jackytouch.controller.Controller;
import com.jad.jackytouch.model.Model;
import com.jad.jackytouch.view.View;

import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IModel model = new Model();
        IController controller = new Controller();
        controller.setModel(model);
        IView view = new View();
        controller.setView(view);
        controller.proceed();
    }
}