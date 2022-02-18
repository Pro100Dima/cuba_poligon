package com.company.cubapoligon.web.screens.order;

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Order;
import com.vaadin.data.ValidationException;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("cubapoligon_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {


    
}