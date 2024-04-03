package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DbService {
    private final db1Repo db1Repo;

    public DbService(com.example.demo.db1Repo db1Repo, com.example.demo.db2Repo db2Repo) {
        this.db1Repo = db1Repo;
        this.db2Repo = db2Repo;
    }
    private final db2Repo db2Repo;


    public Database1 saveDb1(Database1 database1){
       return db1Repo.save(database1);
    }
    public Database2 saveDb2(Database2 database2){

        // Check if employee exists
        Database1 employee = db1Repo.findByEmployeeNumber(database2.getEmployeeNumber()).orElse(null);
        if (employee == null) {
            throw new RuntimeException("Employee not found");
        }

        // Save user if employee exists
        return db2Repo.save(database2);

    }

}
