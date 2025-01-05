package com.ignition.IgniteSpring.services;

import com.ignition.IgniteSpring.model.MaintenanceSchedule;
import com.ignition.IgniteSpring.repository.MaintenanceRepo;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService {

    private final MaintenanceRepo maintenanceRepo;

    public MaintenanceSchedule getMaintainceScheduleById(Long maintenceID){
        return maintenanceRepo.findById(maintenceID).orElse(new MaintenanceSchedule());
    }
}
