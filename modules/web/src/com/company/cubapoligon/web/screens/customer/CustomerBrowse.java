package com.company.cubapoligon.web.screens.customer;

import com.company.cubapoligon.service.OrderService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Customer;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("cubapoligon_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private Table<Customer> customersTable;
    @Inject
    private OrderService orderService;
    @Inject
    private Notifications notifications;
    @Inject
    private MessageBundle messageBundle;

    @Subscribe("customersTable.create")
    public void onCustomersTableCreate(Action.ActionPerformedEvent event) {
        screenBuilders.editor(customersTable)
                .newEntity()
                .withScreenClass(CustomerEdit.class)
                .withLaunchMode(OpenMode.DIALOG)
                .build()
                .show();
    }//создание диалогового окна для создания Клиента

    public void onButtonClick() {
       final Customer singleSelected =  customersTable.getSingleSelected();
       if(singleSelected != null){
           BigDecimal cost = orderService.getAmountByCustomer(singleSelected);
           notifications.create(Notifications.NotificationType.HUMANIZED).withCaption(messageBundle.formatMessage("cost", cost)).show();
       }
    }
}