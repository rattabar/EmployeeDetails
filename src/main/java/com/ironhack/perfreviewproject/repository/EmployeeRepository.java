package com.ironhack.perfreviewproject.repository;

import com.ironhack.perfreviewproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
