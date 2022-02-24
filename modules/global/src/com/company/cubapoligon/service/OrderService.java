package com.company.cubapoligon.service;

import com.company.cubapoligon.entity.Customer;

import java.math.BigDecimal;

public interface OrderService {
    String NAME = "cubapoligon_OrderService";
    BigDecimal getAmountByCustomer(Customer customer);
}