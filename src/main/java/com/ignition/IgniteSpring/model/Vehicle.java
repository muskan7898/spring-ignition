package com.ignition.IgniteSpring.model;


import jakarta.persistence.Id;

public class Vehicle {
    @Id
    private Long id;
    private String model;
    private int year;
    private String status;
    private Long type;
}
