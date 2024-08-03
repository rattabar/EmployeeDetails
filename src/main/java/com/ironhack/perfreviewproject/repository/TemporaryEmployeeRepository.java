package com.ironhack.perfreviewproject.repository;

import com.ironhack.perfreviewproject.model.TemporaryEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporaryEmployeeRepository extends JpaRepository<TemporaryEmployee, Long> {
}
