package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Data
@Table(name = "employees")

public class Employee {
    @Id
    private Long employeeId;

    private String firstName;
    private String lastName;
    private String login;

    public Employee(Long employeeId, String firstName, String lastName, String login) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }
}
