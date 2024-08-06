package com.ironhack.perfreviewproject.controller;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.ironhack.perfreviewproject.model.Process;
import com.ironhack.perfreviewproject.service.ProcessService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/processes")
@RequiredArgsConstructor

public class ProcessController {
    private final ProcessService processService;


    @GetMapping
    public List<Process> findAll(){
        return processService.findAll();
    }

     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     @JsonInclude(JsonInclude.Include.NON_NULL)
    public Process addNewProcess(@RequestBody @Valid Process process){
         return processService.addNewProcess(process);

     }

    @DeleteMapping("/{processId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("processId") Long processId){
        processService.deleteProcess(processId);
    }








//    @PostMapping("/processes/add-to-employee")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void addRoleToUser(@RequestBody RoleToUserDTO roleToUserDTO) {
//        processServiceImpl.addProcessToEmployee(roleToUserDTO.getUsername(), roleToUserDTO.getRoleName());
//    }


}
