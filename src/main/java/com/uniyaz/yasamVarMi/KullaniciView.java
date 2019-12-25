package com.uniyaz.yasamVarMi;

import com.vaadin.ui.*;

/**
 * KullaniciView
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class KullaniciView extends VerticalLayout {
    private FormLayout formLayout;
    private TextField satir;
    private TextField sutun;
    private OperationButton kayit;

    public KullaniciView() {
        buildMainLayout();
    }

    public void buildMainLayout(){
        formLayout = new FormLayout();
        addComponent(formLayout);

        satir = new TextField("Satır sayısını giriniz");
        addComponent(satir);

        sutun = new TextField("Sutün sayısını giriniz");
        addComponent(sutun);

        kayit = new OperationButton("Kayıt");
        kayit.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                event.getButton().setEnabled(false);
                Kata kata = new Kata(satir.getValue(), sutun.getValue());
                addComponent(kata);

            }
        });
        formLayout.addComponent(kayit);
    }
}
