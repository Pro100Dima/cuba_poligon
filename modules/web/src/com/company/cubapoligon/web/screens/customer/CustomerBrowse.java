package com.company.cubapoligon.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Customer;

@UiController("cubapoligon_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}