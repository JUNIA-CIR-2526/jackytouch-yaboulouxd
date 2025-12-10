package com.jad.jackytouch.view;

import com.jad.jackytouch.common.IView;

import java.util.List;

public class View implements IView {

    @Override
    public void displayCar(final String carsBase, final List<String> tunings) {
        StringBuilder car = new StringBuilder(carsBase);
        for (String tuning : tunings){
            for (int i = 0; i<tuning.length()-2; i++){
                if (tuning.charAt(i)!='.') {
                    car.setCharAt(i, tuning.charAt(i));
                }
            }
        }
        System.out.println(car);
    }

    @Override
    public void displaySettingMessage(final String setting){System.out.println("> "+ setting);}

    @Override
    public void displaySettingName(final String setting){System.out.println("| " + setting);}

}
