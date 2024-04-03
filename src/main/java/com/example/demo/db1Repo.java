package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface db1Repo extends JpaRepository<Database1,Long> {
    Optional<Database1>findByEmployeeNumber(String employeeNumber);
}
