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
    @Inject
    private TimeSource timeSource;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Order> event) {
        event.getEntity().setDate(timeSource.currentTimestamp());
        event.getEntity().setAmount(BigDecimal.ZERO);
    }

    @Install(to = "amountField", subject = "validator")
    private void amountFieldValidator(BigDecimal bigDecimal) {
        if(bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) != 1){
            throw new ValidationException("Error amount");// вывод комментария что не правильная сумма
        }
    }

    
}