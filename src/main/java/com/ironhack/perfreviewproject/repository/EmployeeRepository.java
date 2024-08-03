package com.ironhack.perfreviewproject.repository;

import com.ironhack.perfreviewproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

        Optional<Employee> findByLogin(String login);

}
