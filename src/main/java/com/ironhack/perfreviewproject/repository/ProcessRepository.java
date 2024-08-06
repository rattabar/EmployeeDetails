package com.ironhack.perfreviewproject.repository;

import com.ironhack.perfreviewproject.model.Employee;
import com.ironhack.perfreviewproject.model.Process;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProcessRepository extends JpaRepository<Process, Long> {

//    Process findByName(String processName);

}
