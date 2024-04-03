package com.example.demo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "database1")
@Getter
@Setter
public class Database1 {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String fName;
    @Column
    private String lName;    @Column
    private String idNumber;    @Column
    private String phoneNumber;    @Column
    private String email;    @Column
    private String DateJoined;    @Column
    private String Address;
    @Column
    private String employeeNumber;

}
