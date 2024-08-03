package com.ironhack.perfreviewproject.service;


import com.ironhack.perfreviewproject.model.ConfirmedEmployee;
import com.ironhack.perfreviewproject.model.TemporaryEmployee;
import com.ironhack.perfreviewproject.repository.ConfirmedEmployeeRepository;
import com.ironhack.perfreviewproject.repository.TemporaryEmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class TemporaryEmployeeService {
    private final TemporaryEmployeeRepository temporaryEmployeeRepository;

    public List<TemporaryEmployee> findAll() {
        return temporaryEmployeeRepository.findAll();
    }

    public TemporaryEmployee addTemporaryEmployee(TemporaryEmployee temporaryEmployee) {
        log.info("Adding employee {}", temporaryEmployee);
        return temporaryEmployeeRepository.save(temporaryEmployee);
    }

    public TemporaryEmployee updateTemporaryEmployeeById(Long employeeId, TemporaryEmployee temporaryEmployee) {
        log.info("Updating employee");
        var employeeToUpdate = temporaryEmployeeRepository.findById(temporaryEmployee.getEmployeeId()).orElseThrow();
        employeeToUpdate.setFirstName(temporaryEmployee.getFirstName());
        employeeToUpdate.setLastName(temporaryEmployee.getLastName());
        employeeToUpdate.setLogin(temporaryEmployee.getLogin());
        employeeToUpdate.setEndDate(temporaryEmployee.getEndDate());
        return temporaryEmployeeRepository.save(employeeToUpdate);
    }



    public void deleteTemporaryEmployeeById(Long employeeId){
        log.info("Deleting employee with id{}", employeeId);
        temporaryEmployeeRepository.deleteById(employeeId);
    }

}




