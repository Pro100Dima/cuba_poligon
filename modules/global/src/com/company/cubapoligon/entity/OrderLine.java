package com.company.cubapoligon.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CUBAPOLIGON_ORDER_LINE")
@Entity(name = "cubapoligon_OrderLine")
public class OrderLine extends StandardEntity {
    private static final long serialVersionUID = -7765155691617160479L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    @NotNull
    private Product product;

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}