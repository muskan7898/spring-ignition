package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.services.VehicleBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle-bookings")
@RequiredArgsConstructor
public class VehicleBookingController {

    private final VehicleBookingService vehicleBookingService;

    @GetMapping("/booked-on-date")
    public List<Object[]> getVehiclesBookedOnSpecificDate(@RequestParam("date") String date) {
        return vehicleBookingService.getVehiclesBookedOnSpecificDate(date);
    }

    @GetMapping("/vehicle-without-any-booking")
    public List getVehicleWithoutAnyBooking() {
        return vehicleBookingService.getVehicleWithoutAnyBooking();
    }

    @GetMapping("/booking-per-vehicle-type")
    public List getCountBookingPerVehicleType() {
        return vehicleBookingService.countBookingPerVehicleType();
    }
}
