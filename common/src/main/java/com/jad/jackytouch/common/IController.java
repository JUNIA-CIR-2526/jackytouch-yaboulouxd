package com.jad.jackytouch.common;

import java.io.IOException;

public interface IController {

    void setView(IView view);

    void proceed() throws IOException;

    void setModel(IModel model);
}
