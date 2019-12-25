/*
 * Copyright 2019 Universal Bilgi Teknolojileri.
 *
 * UKL 1.1 lisansı ile lisanslanmıştır. Bu dosyanın l,isans koşullarına uygun
 * olmayan şekilde kullanımı yasaklanmıştır. Lisansın bir kopyasını aşağıdaki
 * linkten edinebilirsiniz.
 *
 * http://www.uni-yaz.com/lisans/ukl_1_1.pdf
 *
 * Yasalar aksini söylemediği veya yazılı bir sözleşme ile aksi belirtilmediği sürece,
 * bu yazılım mevcut hali ile hiç bir garanti vermeden veya herhangi bir şart ileri
 * sürmeden dağıtılır. Bu yazılımın edinim izinleri ve limitler konusunda lisans
 * sözleşmesine bakınız.
 *
 */
package com.uniyaz.findPair;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.VerticalLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BoardDesign
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class BoardView extends VerticalLayout {
    GridLayout myGrid;
    int rowSize;
    int index;
    int columnSize;

    public BoardView(int columnSize, int rowSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;

        setMargin(true);

        buildMyGridLayout();

        createOperationButtons();
    }

    private void buildMyGridLayout() {
        myGrid = new GridLayout(columnSize, rowSize);
        myGrid.setSpacing(true);
        addComponent(myGrid);
        setComponentAlignment(myGrid, Alignment.MIDDLE_CENTER);
    }

    private void createOperationButtons() {
        List<EnumOperationButtonIcon> enumOperationButtonIconList = new ArrayList<>();
        List<OperationButton> operationButtonList = new ArrayList<>();
        Map<Map<Integer, Integer>, OperationButton> konumButtonMap = new HashMap<>();

        for (int j = 0; j < rowSize; j++) {
            for (int i = 0; i < columnSize; i++) {
                for (EnumOperationButtonIcon enumOperationButtonIcon : EnumOperationButtonIcon.values()) {
                    enumOperationButtonIconList.add(enumOperationButtonIcon);
                    Map<Integer, Integer> konumMap = new HashMap<>();
                    konumMap.put(i,j);
                    OperationButton operationButton = new OperationButton();
                    konumButtonMap.put(konumMap, operationButton);
                    operationButton.setData(enumOperationButtonIconList.get(i));
                    operationButton.addClickListener(new Button.ClickListener() {
                        @Override
                        public void buttonClick(Button.ClickEvent event) {
                            operationButtonList.add(operationButton);
                            if(konumButtonMap.containsValue(equals(operationButton))){

                            }else{

                            }
                        }
                    });
                    myGrid.addComponent(operationButton, i, j);
                }

            }
        }
    }
}