package com.ignition.IgniteSpring.services;

import com.ignition.IgniteSpring.model.MaintenanceSchedule;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<?> getUpcomingMaintenanceSchedule() {
        String query = "SELECT ms FROM MaintenanceSchedule ms WHERE ms.serviceDetail > CURRENT_DATE";

        TypedQuery<?> jpaQuery = entityManager.createQuery(query, MaintenanceSchedule.class);
        return jpaQuery.getResultList();
    }
}
