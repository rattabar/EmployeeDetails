package com.ironhack.perfreviewproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@Table(name = "temporaryEmployees")

public class TemporaryEmployee extends Employee{

    private String endDate;

    public TemporaryEmployee(String firstName, String lastName, String login, String startDate, String endDate) {
        super(firstName, lastName, login, startDate);
        this.endDate = endDate;
    }
}
