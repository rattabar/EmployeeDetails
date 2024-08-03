package com.ironhack.perfreviewproject.service;

import com.ironhack.perfreviewproject.model.Employee;
import com.ironhack.perfreviewproject.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        log.info("Adding employee {}", employee);
        return employeeRepository.save(employee);
    }

    public Employee updateEmployeeById(Long employeeId, Employee employee) {
        log.info("Updating employee {}", employee);
        var employeeToUpdate = employeeRepository.findById(employee.getEmployeeId()).orElseThrow();
        employeeToUpdate.setFirstName(employee.getFirstName());
        employeeToUpdate.setLastName(employee.getLastName());
        employeeToUpdate.setLogin(employee.getLogin());
        employeeToUpdate.setStartDate(employee.getStartDate());
        return employeeRepository.save(employeeToUpdate);
    }

//    public Optional<Employee> updateEmployeeByLogin(String login, Employee employee){
//        log.info("Updating employee");
//        var employeeToUpdate = employeeRepository.findByLogin(employee.getLogin()).orElseThrow();
//        employeeToUpdate.setEmployeeId(employee.getEmployeeId());
//        employeeToUpdate.setFirstName(employee.getFirstName());
//        employeeToUpdate.setLastName(employee.getLastName());
//        employeeToUpdate.setLogin(employee.getLogin());
//        employeeToUpdate.setStartDate(employee.getStartDate());
//        return employeeRepository.save(employeeToUpdate);
//    }

    public void deleteEmployee(Long employeeId){
        log.info("Deleting employee with id{}", employeeId);
        employeeRepository.deleteById(employeeId);
    }

}
