package com.jad.jackytouch.view;

import com.jad.jackytouch.common.IView;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;

import java.awt.event.KeyEvent;
import java.util.List;

public class View implements IView {
    private static final int SCREEN_WIDTH = 60;
    private static final int SCREEN_HEIGHT = 20;
    private TextWindow window;

    public View(){
        TextWindowSettings settings = new TextWindowSettings();
        settings.setTitle("JackyTouch");
        settings.setScreenHeight(View.SCREEN_HEIGHT);
        settings.setScreenWidth(View.SCREEN_WIDTH);
        settings.addKeyboardListener(KeyEvent.VK_ESCAPE, "exit");
        settings.addKeyboardListener(KeyEvent.VK_SPACE, "Proceed");
        this.window = new TextWindow(settings);
        this.window.setVisible(true);
    }

    @Override
    public void display(final String setting){
        this.window.display(setting);
    }

    @Override
    public void displayCar(final String carsBase, final List<String> tunings) {
        StringBuilder car = new StringBuilder(carsBase);
        for (String tuning : tunings){
            for (int i = 0; i<tuning.length(); i++){
                if (tuning.charAt(i)!='.') {
                    car.setCharAt(i, tuning.charAt(i));
                }
            }
        }
    }

}
