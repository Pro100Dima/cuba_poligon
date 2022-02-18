package com.company.cubapoligon.web.screens.strore;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Strore;

@UiController("cubapoligon_Strore.edit")
@UiDescriptor("strore-edit.xml")
@EditedEntityContainer("stroreDc")
@LoadDataBeforeShow
public class StroreEdit extends StandardEditor<Strore> {
}