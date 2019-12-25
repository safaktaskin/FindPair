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
package com.uniyaz.yasamVarMi;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;

/**
 * OperationButton
 *
 * @author Şafak Taşkın
 * @since 5.187
 */
public class OperationButton extends Button {

    public OperationButton(FontAwesome bomb){
        setWidth(50, Unit.PERCENTAGE);
    }

    public OperationButton(String caption) {
        super(caption);
    }

    public OperationButton() {

    }
}
