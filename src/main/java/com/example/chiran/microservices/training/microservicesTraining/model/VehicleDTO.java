package com.example.chiran.microservices.training.microservicesTraining.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class VehicleDTO {

    @Id
    private Long Id;

    public VehicleDTO(Long id, String vehicleNumber, String ownerName) {
        Id = id;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "Id=" + Id +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    private  String vehicleNumber;
    private String ownerName;

}
