package com.company.cubapoligon.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Order;

@UiController("cubapoligon_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}