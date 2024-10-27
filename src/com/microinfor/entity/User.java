package com.microinfor.entity;

import com.microinfor.heritage.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

