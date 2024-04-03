package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class Controller {

    @Autowired
    private DbService dbService;
    @PostMapping("/save")
    public Database2 saveDb2(@RequestBody Database2 database2){

        Database2 createEmployee= dbService.saveDb2(database2);
        System.out.println("Employee Created with ID: "+createEmployee.getEmployeeNumber());
        return createEmployee;
    }
    @PostMapping("/saveDB")
    public Database1 saveDb1(@RequestBody Database1 database1){

        Database1 createEmployee= dbService.saveDb1(database1);
        System.out.println("Employee Created with ID: "+createEmployee.getEmployeeNumber());
        return createEmployee;
    }
}
