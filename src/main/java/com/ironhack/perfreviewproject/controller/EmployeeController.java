package com.ironhack.perfreviewproject.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ironhack.perfreviewproject.model.Employee;
import com.ironhack.perfreviewproject.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor

public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Employee addEmployee(@RequestBody @Valid Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{employeeId}")
    public Employee updateEmployeeById(@PathVariable("employeeId") Long employeeId, @RequestBody Employee employee){
        return employeeService.updateEmployeeById(employeeId, employee);
    }

    @PutMapping("login/{login}")
    public Employee updateEmployeeByLogin(@PathVariable("login") String login, @RequestBody Employee employee){
        return employeeService.updateEmployeeByLogin(login, employee);
    }

    @DeleteMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }

}
