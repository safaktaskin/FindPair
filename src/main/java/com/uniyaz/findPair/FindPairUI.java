package com.uniyaz.findPair;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class FindPairUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        int columnSize = 4;
        int rowSize = 4;
        BoardView boardView = new BoardView(columnSize, rowSize);
        setContent(boardView);
    }

}
