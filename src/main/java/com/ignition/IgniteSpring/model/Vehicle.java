package com.ignition.IgniteSpring.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @Column(name = "\"year\"") // Escape reserved keyword
    private int year;
    private String status;

    @Column(nullable = false)
    private Long type;
}
