package com.uniyaz.yasamVarMi;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 *
 */
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class YasamVarMiUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {


        KullaniciView kullaniciView = new KullaniciView();
        kullaniciView.addComponent(new Label("Şafak"));
        setContent(kullaniciView);

    }

}
