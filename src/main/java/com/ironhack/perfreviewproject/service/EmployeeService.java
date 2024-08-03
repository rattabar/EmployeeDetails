package com.ironhack.perfreviewproject.service;

import com.ironhack.perfreviewproject.model.Employee;
import com.ironhack.perfreviewproject.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userDetailsService")
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

    public Employee updateEmployee(Long employeeId, Employee employee) {
        log.info("Updating employee {}", employee);
        var employeeToUpdate = employeeRepository.findById(employee.getEmployeeId()).orElseThrow();
        employeeToUpdate.setFirstName(employee.getFirstName());
        employeeToUpdate.setLastName(employee.getLastName());
        employeeToUpdate.setLogin(employee.getLogin());
        return employeeRepository.save(employeeToUpdate);
    }

    public void deleteEmployee(Long employeeId){
        log.info("Deleting employee with id{}", employeeId);
        employeeRepository.deleteById(employeeId);
    }

}
