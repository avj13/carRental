package com.machinecoding.Store;

import com.machinecoding.InventoryManagementSystem;
import com.machinecoding.Reservation.Reservation;
import com.machinecoding.User.User;
import com.machinecoding.Vehicle.Vehicle;
import com.machinecoding.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    StoreLocation location;
    InventoryManagementSystem inventoryManagement;
    List<Reservation> reservations = new ArrayList<>();

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public StoreLocation getLocation() {
        return location;
    }

    public void setLocation(StoreLocation location) {
        this.location = location;
    }

    public InventoryManagementSystem getInventoryManagement() {
        return inventoryManagement;
    }

    public void setInventoryManagement(InventoryManagementSystem inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }
    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return inventoryManagement.getVehicleList();
    }
    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new InventoryManagementSystem(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation
}
