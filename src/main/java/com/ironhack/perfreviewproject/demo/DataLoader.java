package com.ironhack.perfreviewproject.demo;

import com.ironhack.perfreviewproject.model.Role;
import com.ironhack.perfreviewproject.model.User;
import com.ironhack.perfreviewproject.service.EmployeeService;
import com.ironhack.perfreviewproject.service.RoleService;
import com.ironhack.perfreviewproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserService userService;
    private final RoleService roleService;

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


    }


}
