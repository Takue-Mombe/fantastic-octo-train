package com.example.demo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "database2")
@Getter
@Setter
public class Database2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String Department;

    @ManyToOne
    private Database1 database1;
    @Column
    private String employeeNumber;
    @Column
    private String phoneNumber;
    @Column
    private String position;
}
