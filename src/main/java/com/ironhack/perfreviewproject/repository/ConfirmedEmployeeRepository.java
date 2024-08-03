package com.ironhack.perfreviewproject.repository;

import com.ironhack.perfreviewproject.model.ConfirmedEmployee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConfirmedEmployeeRepository extends JpaRepository<ConfirmedEmployee, Long>{
}
