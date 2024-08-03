package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@NoArgsConstructor
@Data
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String firstName;
    private String lastName;
    private String login;
        private String startDate;

    public Employee(String firstName, String lastName, String login, String startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.startDate = startDate;
    }

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "employees_processes",
//            joinColumns = @JoinColumn(name = "employee_id"),
//            inverseJoinColumns = @JoinColumn(name = "processId")
//    )
//    private Set<Employee> employees = new HashSet<>();
}
