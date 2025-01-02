package com.ignition.IgniteSpring.model;

import jakarta.persistence.Id;

public class MaintenanceSchedule {
    @Id
    private Long id;
    private Long vehicleId;
    private String serviceDetail;

}
