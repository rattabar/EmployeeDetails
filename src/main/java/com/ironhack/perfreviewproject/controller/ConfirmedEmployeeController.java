package com.ironhack.perfreviewproject.controller;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.ironhack.perfreviewproject.model.ConfirmedEmployee;
import com.ironhack.perfreviewproject.model.Employee;
import com.ironhack.perfreviewproject.repository.ConfirmedEmployeeRepository;
import com.ironhack.perfreviewproject.service.ConfirmedEmployeeService;
import com.ironhack.perfreviewproject.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/confirmedEmployees")
@RequiredArgsConstructor

public class ConfirmedEmployeeController {
    private final ConfirmedEmployeeService confirmedEmployeeService;

    @GetMapping
    public List<ConfirmedEmployee> findAll(){
        return confirmedEmployeeService.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConfirmedEmployee addConfirmedEmployee(@RequestBody @Valid ConfirmedEmployee employee){
        return confirmedEmployeeService.addConfirmedEmployee(employee);
    }

    @PutMapping("/{employeeId}")
    public Employee updateConfirmedEmployeeById(@PathVariable("employeeId") Long employeeId, @RequestBody ConfirmedEmployee confirmedEmployee){
        return confirmedEmployeeService.updateConfirmedEmployeeById(employeeId, confirmedEmployee);
    }

//    @PutMapping("/{login}")
//    public Optional<Employee> updateEmployeeByLogin(@PathVariable("login") String login, @RequestBody Employee employee){
//        return employeeService.updateEmployeeByLogin(login, employee);
//    }

    @DeleteMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConfirmedEmployee(@PathVariable("employeeId") Long employeeId){
        confirmedEmployeeService.deleteConfirmedEmployee(employeeId);
    }

}
