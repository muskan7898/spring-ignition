package com.ignition.IgniteSpring.services;

import jakarta.persistence.*;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class VehicleBookingService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getVehiclesBookedOnSpecificDate(String date) {
        String query = "SELECT v.id, v.type, v.model, v.year, v.status " +
                "FROM Vehicle v " +
                "JOIN VehicleBooking vb ON v.id = vb.vehicleId " +
                "JOIN Booking b ON vb.bookingId = b.id " +
                "WHERE :date BETWEEN b.startDate AND b.endDate";


        Query jpaQuery = entityManager.createQuery(query);
        System.out.println(jpaQuery);
        jpaQuery.setParameter("date", date);
        return jpaQuery.getResultList();
    }
    public List getVehicleWithoutAnyBooking(){
        String query = "SELECT v.id, v.type, v.model, v.year, v.status" +
                "FROM Vehicle v" +
                "LEFT JOIN VehicleBooking vb ON v.id = vb.vehicleId" +
                "WHERE vb.bookingId IS NULL";

        Query jpaQuery = entityManager.createQuery(query);
        return jpaQuery.getResultList();
    }

    public List countBookingPerVehicleType(){
        String query = "SELECT vt.typeName, COUNT(vb.bookingId) AS bookingCount" +
                "FROM VehicleType vt" +
                "JOIN Vehicle v ON vt.typeId = v.type" +
                "LEFT JOIN VehicleBooking vb ON v.id = vb.vehicleId" +
                "GROUP BY vt.typeName";
        Query jpaQuery = entityManager.createQuery(query);
        return jpaQuery.getResultList();
    }
}

