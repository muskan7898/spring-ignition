package com.ignition.IgniteSpring.controller;


import com.ignition.IgniteSpring.services.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/maintenance")
public class MaintenceController {
    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping("upcomingSchedule")
    public List getUpcomingMaintenanceSchedule(){
        return maintenanceService.getUpcomingMaintenanceSchedule();
    }
}
