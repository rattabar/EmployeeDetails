package com.ironhack.perfreviewproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@Table(name = "confirmedEmployees")
public class ConfirmedEmployee extends Employee{
    private double overTimeCounter;
    private float paidHolidaysCounter;

    public ConfirmedEmployee(double overTimeCounter, float paidHolidaysCounter) {
        this.overTimeCounter = overTimeCounter;
        this.paidHolidaysCounter = paidHolidaysCounter;
    }
}
