package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee {
    @Id
    private Long employeeId;


    private String firstName;
    private String lastName;
    private String login;

    private String startDate;


}
