package com.ironhack.perfreviewproject.demo;

import com.ironhack.perfreviewproject.model.*;
import com.ironhack.perfreviewproject.model.Process;
import com.ironhack.perfreviewproject.security.Role;
import com.ironhack.perfreviewproject.security.RoleService;
import com.ironhack.perfreviewproject.security.User;
import com.ironhack.perfreviewproject.security.UserService;
import com.ironhack.perfreviewproject.service.*;
import lombok.RequiredArgsConstructor;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserService userService;
    private final RoleService roleService;
    private final EmployeeService employeeService;
    private final ConfirmedEmployeeService confirmedEmployeeService;
//    private final TemporaryEmployeeService temporaryEmployeeService;
    private final ProcessService processService;
    private final TemporaryEmployeeService temporaryEmployeeService;

    Faker fk = new Faker();

    @Override
    public void run(String... args) throws Exception {
        roleService.save(new Role("ROLE_USER"));
        roleService.save(new Role("ROLE_ADMIN"));

        userService.saveUser(new User("John Doe", "john", "1234"));
        userService.saveUser(new User("James Smith", "james", "1234"));
        userService.saveUser(new User("Jane Carry", "jane", "1234"));
        userService.saveUser(new User("Chris Anderson", "chris", "1234"));
        userService.saveUser(new User("Ayoub RATTAB", "rattabar", "1234"));

        roleService.addRoleToUser("john", "ROLE_USER");
        roleService.addRoleToUser("james", "ROLE_ADMIN");
        roleService.addRoleToUser("jane", "ROLE_USER");
        roleService.addRoleToUser("chris", "ROLE_ADMIN");
        roleService.addRoleToUser("chris", "ROLE_USER");
        roleService.addRoleToUser("rattabar", "ROLE_ADMIN");

        for (int i = 0; i < 10; i++) {
            employeeService.addEmployee(new Employee(fk.name().firstName(), fk.name().lastName(), fk.internet().username(), fk.date().birthday(0, 5).toString()));
        }

        // Add new Confirmed Employee
        confirmedEmployeeService.addConfirmedEmployee(new ConfirmedEmployee("Ayoub","RATTAB", "rattabar", "2019-06-30",15L, 5L));

        // Add new Temporary Employee
        temporaryEmployeeService.addTemporaryEmployee(new TemporaryEmployee("Andreas", "Iniesta", "ainiesta", "2024-06-01","2024-08-30"));


        for (int i = 0; i < 5; i++) {
            processService.addNewProcess(new Process(fk.job().position(), fk.name().firstName(), fk.date().birthday(0, 5).toString()));
        }



    }



}
