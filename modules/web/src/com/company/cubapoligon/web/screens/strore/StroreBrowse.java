package com.company.cubapoligon.web.screens.strore;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Strore;

@UiController("cubapoligon_Strore.browse")
@UiDescriptor("strore-browse.xml")
@LookupComponent("stroresTable")
@LoadDataBeforeShow
public class StroreBrowse extends StandardLookup<Strore> {
}