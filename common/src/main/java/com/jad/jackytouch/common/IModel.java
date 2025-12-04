package com.jad.jackytouch.common;

import java.io.IOException;

public interface IModel {
    String getCarBase() throws IOException;
    String getExhaust() throws IOException;
    String getCarNeon() throws IOException;
    String getCarRims() throws IOException;
    String getCarSpoiler() throws IOException;

    public String getMessageEsthetique();
    public String getMessageAerodynamique();
    public String getMessageExagere();
    public String getMessageSobre();
    public String getMessageDisco();
    public String getMessageAleatoire();
    public String getMessagePerformance();
    public String getMessageLowCost();
    public String getMessageShowOff();
    public String getMessageDiscret();
    public String getMessageSport();
    public String getMessageDrag();
}