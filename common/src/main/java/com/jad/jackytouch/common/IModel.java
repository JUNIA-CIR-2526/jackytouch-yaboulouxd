package com.jad.jackytouch.common;

import java.io.IOException;
import java.util.List;

public interface IModel {
    String getCarBase();
    public List<String> getTunings();
    public List<String> getDescs();
    public void addTuning(int i);
}