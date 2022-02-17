package com.company.cubapoligon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CUBAPOLIGON_STRORE")
@Entity(name = "cubapoligon_Strore")
@NamePattern("%s|name")
public class Strore extends StandardEntity {
    private static final long serialVersionUID = 4307751920323054313L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "ADDRESS_STREET")),
            @AttributeOverride(name = "number", column = @Column(name = "ADDRESS_NUMBER_"))
    })
    private Address address;

    @Column(name = "STORE_TYPE")
    private Integer storeType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoreType getStoreType() {
        return storeType == null ? null : StoreType.fromId(storeType);
    }

    public void setStoreType(StoreType storeType) {
        this.storeType = storeType == null ? null : storeType.getId();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}