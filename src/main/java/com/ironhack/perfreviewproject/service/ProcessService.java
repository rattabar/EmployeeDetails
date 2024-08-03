package com.ironhack.perfreviewproject.service;


import com.ironhack.perfreviewproject.model.Process;
import com.ironhack.perfreviewproject.repository.ProcessRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class ProcessService {
    private final ProcessRepository processRepository;

    public List<Process> findAll(){
        return processRepository.findAll();
    }

    public Process addNewProcess(Process process) {
        log.info("Adding process {}", process);
        return processRepository.save(process);
    }




}

