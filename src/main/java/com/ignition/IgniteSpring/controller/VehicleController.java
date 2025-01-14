package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.model.Vehicle;
import com.ignition.IgniteSpring.services.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vehicle")
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;

    @PostMapping("/create")
    public String insertNewVehicle(@RequestBody Vehicle vehicle){
        return "";
    }

    @GetMapping("/getAllVehicle")
    public List<Vehicle> trackAvailableVehicle(){
        return null;
    }

    // get detail of vehicle booked on specific date
    @GetMapping()
    public List<Vehicle> vehicleBookedOnSpecificDate(){
        return null;
    }

    @PutMapping("updateVehicle/{id}")
    public void updateVehicleStatus(@PathVariable Long id){

    }

    @DeleteMapping("deleteVehicle/{id}")
    public void deleteVehicleById(@PathVariable Long id) {
    }

}
