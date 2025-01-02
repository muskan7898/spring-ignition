package com.ignition.IgniteSpring.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startDate;
    private String endDate;
}
