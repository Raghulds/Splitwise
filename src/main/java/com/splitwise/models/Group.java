package com.splitwise.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "groups")
public class Group extends BaseModel {
    private String description;
    @OneToMany(targetEntity=User.class)
    private List<User> admins;
    @OneToMany(targetEntity=User.class)
    private List<User> participants;
    @OneToMany(targetEntity=Expense.class)
    private List<Expense> expenses;
    @OneToOne()
    @JoinColumn(name = "creator_id")
    private User createdBy;
}
