package com.example.chiran.microservices.training.microservicesTraining.repository;

import com.example.chiran.microservices.training.microservicesTraining.model.VehicleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepsitory extends JpaRepository<VehicleDTO, Long> {
}
