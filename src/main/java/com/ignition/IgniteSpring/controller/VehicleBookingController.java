package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.services.VehicleBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle-bookings")
@RequiredArgsConstructor
public class VehicleBookingController {

    private final VehicleBookingService vehicleBookingService;

    @GetMapping("/booked-on-date")
    public ResponseEntity<List<Object[]>> getVehiclesBookedOnSpecificDate(@RequestParam("date") String date) {
        List<Object[]> bookings = vehicleBookingService.getVehiclesBookedOnSpecificDate(date);
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/vehicle-without-any-booking")
    public ResponseEntity<List<?>> getVehicleWithoutAnyBooking() {
        List<?> vehicles = vehicleBookingService.getVehicleWithoutAnyBooking();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/booking-per-vehicle-type")
    public ResponseEntity<List<?>> getCountBookingPerVehicleType() {
        List<?> bookingCounts = vehicleBookingService.countBookingPerVehicleType();
        return ResponseEntity.ok(bookingCounts);
    }
}
