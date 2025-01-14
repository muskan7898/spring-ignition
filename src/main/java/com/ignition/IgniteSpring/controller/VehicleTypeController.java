package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.model.Vehicle;
import com.ignition.IgniteSpring.services.VehicleTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/vehicle-type")

public class VehicleTypeController {
    private VehicleTypeService vehicleTypeService;

//    get all vehicle with their type
    @GetMapping("/{id}")
    public List<Vehicle> getAllVehicleWithType(){
        return null;
    }


}
