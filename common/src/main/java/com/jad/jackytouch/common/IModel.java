package com.jad.jackytouch.common;

import java.io.IOException;

public interface IModel {
    String getCarBase() throws IOException;
    String getExhaust() throws IOException;
    String getCarNeon() throws IOException;
    String getCarRims() throws IOException;
    String getCarSpoiler() throws IOException;
}