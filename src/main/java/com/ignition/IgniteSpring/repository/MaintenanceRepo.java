package com.ignition.IgniteSpring.repository;

import com.ignition.IgniteSpring.model.MaintenanceSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaintenanceRepo extends JpaRepository<MaintenanceSchedule, Long> {

}
