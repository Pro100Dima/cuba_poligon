package com.company.cubapoligon.web.screens.customer;

import com.company.cubapoligon.entity.Order;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubapoligon.entity.Customer;

import javax.inject.Inject;
import java.awt.*;

@UiController("cubapoligon_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
//@LoadDataBeforeShow --автоматическая загрузка данных

public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private CollectionLoader<Order> ordersDl;
    @Inject
    private Dialogs dialogs;

    @Inject
    private MessageBundle messageBundle;

/*    @Subscribe
    public void onBeforeClose(BeforeCloseEvent event) {
        if (getEditedEntity().getEmail() == null) {
            dialogs.createOptionDialog().withCaption(messageBundle.getMessage("questionEmail")).withActions(
                    new DialogAction(DialogAction.Type.YES, Action.Status.PRIMARY).withHandler(e->{
                        closeWithCommit();
                            }),
                    new DialogAction(DialogAction.Type.NO)
            ).show();
            event.preventWindowClose();
        }
    }*///создание валидатора на почту и вывода сообщения


    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
    
    
}