package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.services.VehicleBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vehicle-bookings")
@RequiredArgsConstructor

public class VehicleBookingController {
    private final VehicleBookingService vehicleBookingService;


}
