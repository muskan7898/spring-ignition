package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.model.MaintenanceSchedule;
import com.ignition.IgniteSpring.services.MaintenanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
@RequiredArgsConstructor
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    @PostMapping("/create")
    public String addNewMaintenance(@RequestBody MaintenanceSchedule maintenanceSchedule){
        return "";
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaintenanceSchedule> getMaintenanceScheduleById(@PathVariable Long id) {
        MaintenanceSchedule schedule = maintenanceService.getMaintainceScheduleById(id);
        return ResponseEntity.ok(schedule);
    }

//    list maintanance schedule for specific vehicle
    @GetMapping("/{vehicleId}")
    public List<MaintenanceSchedule> getMaintenanceScheduleForSpecificVehicle(@PathVariable Long id){
        return null;
    }



}
