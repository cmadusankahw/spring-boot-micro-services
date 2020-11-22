package com.example.chiran.microservices.training.microservicesTraining.service;

import com.example.chiran.microservices.training.microservicesTraining.model.VehicleDTO;

import java.util.List;

public interface ParkingService {

    List<VehicleDTO> getAllVehicles();

    String park(VehicleDTO vehicleDTO);

    String unpark(Long id);
}
