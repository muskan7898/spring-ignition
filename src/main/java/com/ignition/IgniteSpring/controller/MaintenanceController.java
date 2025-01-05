package com.ignition.IgniteSpring.controller;

import com.ignition.IgniteSpring.services.MaintenanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
@RequiredArgsConstructor

public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    @GetMapping("/upcoming-schedule")
    public List getUpcomingMaintenanceSchedule() {
        return maintenanceService.getUpcomingMaintenanceSchedule();
    }
}
