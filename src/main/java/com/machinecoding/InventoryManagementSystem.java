package com.machinecoding;

import com.machinecoding.Vehicle.Vehicle;

import java.util.List;

public class InventoryManagementSystem {
    List<Vehicle> vehicleList;

    public InventoryManagementSystem(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
