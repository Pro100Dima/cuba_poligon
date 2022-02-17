package com.company.cubapoligon.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum StoreType implements EnumClass<Integer> {

    MINI(10),
    SUPER(20);

    private Integer id;

    StoreType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static StoreType fromId(Integer id) {
        for (StoreType at : StoreType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}