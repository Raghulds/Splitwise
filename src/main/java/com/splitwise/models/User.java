package com.splitwise.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseModel {
    private String userName;
    private String phone;
    private String pwdHashed;

    public User(String userName, String phone, String pwdHashed) {
        this.userName = userName;
        this.phone = phone;
        this.pwdHashed = pwdHashed;
    }
}
