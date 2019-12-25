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
package com.uniyaz;

import com.uniyaz.findPair.FindPairUI;
import com.uniyaz.yasamVarMi.YasamVarMiUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

/**
 * MyUIServlet
 *
 * @author Şafak Taşkın
 * @since 5.187
 */

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = FindPairUI.class, productionMode = false)
public class MyUIServlet extends VaadinServlet {

}
