package com.ironhack.perfreviewproject.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ironhack.perfreviewproject.model.ConfirmedEmployee;
import com.ironhack.perfreviewproject.model.Employee;
import com.ironhack.perfreviewproject.model.TemporaryEmployee;
import com.ironhack.perfreviewproject.service.ConfirmedEmployeeService;
import com.ironhack.perfreviewproject.service.TemporaryEmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temporaryEmployees")
@RequiredArgsConstructor

public class TemporaryEmployeeController {
    private final TemporaryEmployeeService temporaryEmployeeService;

    @GetMapping
    public List<TemporaryEmployee> findAll(){
        return temporaryEmployeeService.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TemporaryEmployee addTemporaryEmployee(@RequestBody @Valid TemporaryEmployee employee){
        return temporaryEmployeeService.addTemporaryEmployee(employee);
    }

    @PutMapping("/{employeeId}")
    public Employee updateTemporaryEmployeeById(@PathVariable("employeeId") Long employeeId, @RequestBody TemporaryEmployee temporaryEmployee){
        return temporaryEmployeeService.updateTemporaryEmployeeById(employeeId, temporaryEmployee);
    }

//    @PutMapping("/{login}")
//    public Optional<Employee> updateEmployeeByLogin(@PathVariable("login") String login, @RequestBody Employee employee){
//        return employeeService.updateEmployeeByLogin(login, employee);
//    }

    @DeleteMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTemporaryEmployee(@PathVariable("employeeId") Long employeeId){
        temporaryEmployeeService.deleteTemporaryEmployeeById(employeeId);
    }


}
