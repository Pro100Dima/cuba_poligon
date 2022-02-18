package com.company.cubapoligon.web.screens.customer;

import com.company.cubapoligon.entity.Order;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Customer;

import javax.inject.Inject;

@UiController("cubapoligon_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
//@LoadDataBeforeShow --автоматическая загрузка данных

public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
    
    
}