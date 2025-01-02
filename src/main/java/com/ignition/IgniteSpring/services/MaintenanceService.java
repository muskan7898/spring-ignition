package com.ignition.IgniteSpring.services;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MaintenanceService{
    @PersistenceContext
    private EntityManager entityManager;

    public List getUpcomingMaintenanceSchedule(){
        String query = "SELECT ms.*" +
                "FROM MaintenanceSchedule ms" +
                "WHERE ms.serviceDetail > CURRENT_DATE";

        Query jpaQuery = entityManager.createQuery(query);
        return jpaQuery.getResultList();
    }
}
