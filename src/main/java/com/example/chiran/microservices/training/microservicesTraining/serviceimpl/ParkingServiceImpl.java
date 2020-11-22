package com.example.chiran.microservices.training.microservicesTraining.serviceimpl;

import com.example.chiran.microservices.training.microservicesTraining.model.VehicleDTO;
import com.example.chiran.microservices.training.microservicesTraining.repository.ParkingRepsitory;
import com.example.chiran.microservices.training.microservicesTraining.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParkingServiceImpl implements ParkingService {

    @Autowired
    ParkingRepsitory parkingRepsitory;

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return parkingRepsitory.findAll();
    }

    @Override
    public String park(VehicleDTO vehicleDTO) {
        if (vehicleDTO.getId() >0 && vehicleDTO.getId() <= 10) {
            List<VehicleDTO> dtos = parkingRepsitory.findAll();
            for(VehicleDTO dto : dtos) {
                if (dto.getId() != vehicleDTO.getId()) {
                    parkingRepsitory.save(vehicleDTO);
                }
                else {
                    throw new RuntimeException(vehicleDTO.getId() + " slot is not vacant");
                }
            }
        }
        else {
            throw  new RuntimeException("Kindly provide an id between 1 to 10");
        }
        return "Parked!";
    }

    @Override
    public String unpark(Long id) {
        if (id>0 && id<=10) {
            parkingRepsitory.deleteById(id);
        } else {
            throw  new RuntimeException("Kindly provide id between 1 to 10");
        }
        return  "Unparked vehicle slot :{}"+ id;
    }
}
