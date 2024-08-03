package com.ironhack.perfreviewproject.service;

import com.ironhack.perfreviewproject.model.ConfirmedEmployee;
import com.ironhack.perfreviewproject.repository.ConfirmedEmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConfirmedEmployeeService {

    private final ConfirmedEmployeeRepository confirmedEmployeeRepository;

    public List<ConfirmedEmployee> findAll() {
            return confirmedEmployeeRepository.findAll();
        }

        public ConfirmedEmployee addConfirmedEmployee(ConfirmedEmployee confirmedEmployee) {
            log.info("Adding employee {}", confirmedEmployee);
            return confirmedEmployeeRepository.save(confirmedEmployee);
        }

        public ConfirmedEmployee updateConfirmedEmployeeById(Long employeeId, ConfirmedEmployee confirmedEmployee) {
            log.info("Updating employee");
            var employeeToUpdate = confirmedEmployeeRepository.findById(confirmedEmployee.getEmployeeId()).orElseThrow();
            employeeToUpdate.setFirstName(confirmedEmployee.getFirstName());
            employeeToUpdate.setLastName(confirmedEmployee.getLastName());
            employeeToUpdate.setLogin(confirmedEmployee.getLogin());
            employeeToUpdate.setOverTimeCounter(confirmedEmployee.getOverTimeCounter());
            employeeToUpdate.setPaidHolidaysCounter(confirmedEmployee.getPaidHolidaysCounter());
            return confirmedEmployeeRepository.save(employeeToUpdate);
        }



        public void deleteConfirmedEmployee(Long employeeId){
            log.info("Deleting employee with id{}", employeeId);
            confirmedEmployeeRepository.deleteById(employeeId);
        }

    }

