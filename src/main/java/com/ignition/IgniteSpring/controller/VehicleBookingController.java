package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.services.VehicleBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle-bookings")

public class VehicleBookingController {
    @Autowired
    private VehicleBookingService vehicleBookingService;

    @GetMapping("/booked-on-date")
    public List<Object[]> getVehiclesBookedOnSpecificDate(@RequestParam("date") String date) {
        return vehicleBookingService.getVehiclesBookedOnSpecificDate(date);
    }

    @GetMapping("/VehicleWithoutAnyBooking")
    public List getVehicleWithoutAnyBooking(){
        return vehicleBookingService.getVehicleWithoutAnyBooking();
    }

    @GetMapping("/BookingPerVehicleType")
    public List getCountBookingPerVehicleType(){
        return vehicleBookingService.countBookingPerVehicleType();
    }

}
