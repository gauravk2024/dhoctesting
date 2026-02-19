package com.test.health.entiyty;

import jakarta.persistence.*;

@Table (name = "UserEntity")
@Entity
//@All
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String sallarry;
    private String empComoName;
    private Boolean areYouPwirng = true;
}
