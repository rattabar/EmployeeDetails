package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.*;

import static jakarta.persistence.FetchType.EAGER;


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





//    @ManyToMany(fetch = EAGER)
//    @JoinTable(
//            name = "employee_processes",
//            joinColumns = @JoinColumn(name = "employee_id"),
//            inverseJoinColumns = @JoinColumn(name = "process_id")
//    )
//    private Collection<Process> processes = new ArrayList<>();
//
//    public Employee(Collection<Process> processes) {
//        this.processes = processes;
    }

//    public Collection<Process> getProcesses() {
//        return processes;
//    }
//
//    public void setProcesses(Collection<Process> processes) {
//        this.processes = processes;

}
