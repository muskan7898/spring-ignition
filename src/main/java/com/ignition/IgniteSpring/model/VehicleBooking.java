package com.ignition.IgniteSpring.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class VehicleBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long VehicleId;
    private Long BookingId;
}

