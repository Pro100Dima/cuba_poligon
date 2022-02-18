package com.company.cubapoligon.web.screens.order;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Order;
import com.vaadin.data.ValidationException;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@UiController("cubapoligon_Order.newEdit")
@UiDescriptor("order-new-edit.xml")
@EditedEntityContainer("orderDc")
@PrimaryEditorScreen(Order.class)// так мы указываем что это основной экран для редактирования
@LoadDataBeforeShow
public class OrderNewEdit extends StandardEditor<Order> {
    @Inject
    private TimeSource timeSource;
    @Inject
    private UniqueNumbersService uniqueNumbersService;
    @Inject
    private Notifications notifications;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Order> event) {
        event.getEntity().setDate(timeSource.currentTimestamp());
        event.getEntity().setAmount(BigDecimal.ZERO);
        event.getEntity().setNumber(Long.toString(uniqueNumbersService.getNextNumber("orderNumber")));
    }

    @Install(to = "amountField", subject = "validator")
    private void amountFieldValidator(BigDecimal bigDecimal) {
        if(bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) != 1){
            //throw new ValidationException(newList);// вывод комментария что не правильная сумма
            notifications.create().withCaption("Error amount!").show();
        }
    }
}