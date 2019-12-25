package com.uniyaz.yasamVarMi;

import com.vaadin.ui.*;

import java.util.*;

/**
 * Kata
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class Kata extends VerticalLayout {
    private GridLayout myGrid;
    private OperationButton button;

    public Kata(String sutun, String satir) {
        myGrid = new GridLayout(Integer.valueOf(sutun), Integer.valueOf(satir));
        addComponent(myGrid);
        HashMap<Map<Integer, Integer>, Button> sonuc = new HashMap();
        List<Button> buttonList = new ArrayList();
        for (int row = 0; row < Integer.valueOf(satir); row++) {
            for (int col = 0; col < Integer.valueOf(sutun); col++) {
                button = new OperationButton(" + ");
                Random random = new Random();
                int index;
                index = random.nextInt(2);
                button.setData(index);
                HashMap<Integer, Integer> konum = new HashMap<>();
                konum.put(row, col);
                sonuc.put(konum, button);
                buttonList.add(button);
//                System.out.println(index);

//                myGrid.addComponent(button, row, col);
//                button.addClickListener(new Button.ClickListener() {
//                    @Override
//                    public void buttonClick(Button.ClickEvent event) {
//                        if(index == 1){
//                            HashMap hashMap = new HashMap();
//                            if(hashMap.containsValue(1)){
//                                button.setStyleName(ValoTheme.BUTTON_PRIMARY);
//                            }
//                        }
//                        else{
//                            button.setStyleName(ValoTheme.BUTTON_DANGER);
//                        }
//
//
//
//                    }
//                });

            }
        }
    }


}

