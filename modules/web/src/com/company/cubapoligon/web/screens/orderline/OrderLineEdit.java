package com.company.cubapoligon.web.screens.orderline;

import com.company.cubapoligon.entity.Order;
import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.OrderLine;
import com.vaadin.data.ValidationException;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("cubapoligon_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
@LoadDataBeforeShow
public class OrderLineEdit extends StandardEditor<OrderLine> {

}