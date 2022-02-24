package com.company.cubapoligon.service;

import com.company.cubapoligon.entity.Customer;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.haulmont.cuba.core.Query;

import javax.inject.Inject;
import javax.swing.text.html.parser.Entity;
import java.math.BigDecimal;

@Service(OrderService.NAME)
public class OrderServiceBean implements OrderService {
    @Inject
    private Persistence persistence;

    @Override
    @Transactional
    public BigDecimal getAmountByCustomer(Customer customer) {
        BigDecimal result;
        try(final Transaction transaction = persistence.createTransaction()){
            final EntityManager entityManager = persistence.getEntityManager();
            final Query query =  entityManager.createQuery("select sum(o.amount) from poligon_Order Where o.customer = :customerId");
             query.setParameter("customerId", customer.getId());
             result = (BigDecimal)query.getFirstResult();
             transaction.commit();
        }
        return result!=null ? result : BigDecimal.ZERO;
    }
}