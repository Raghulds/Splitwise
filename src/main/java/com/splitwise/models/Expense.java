package com.splitwise.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "expenses")
public class Expense extends BaseModel {
    private Integer amount;
    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;
    private String description;
}
