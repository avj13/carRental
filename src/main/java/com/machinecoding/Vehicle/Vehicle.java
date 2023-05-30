package com.machinecoding.Vehicle;

import java.util.Date;
import java.util.Objects;

public class Vehicle {
    int id;
    String vehicleNumber;
    VehicleType vehicleType;
    String vehicleCompany;
    String modelName;
    int kmDriven;
    Date manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;
    Status status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return getVehicleId() == vehicle.getVehicleId() && getNoOfSeat() == vehicle.getNoOfSeat() && Objects.equals(getVehicleNumber(), vehicle.getVehicleNumber()) && getVehicleType() == vehicle.getVehicleType() && Objects.equals(getVehicleCompany(), vehicle.getVehicleCompany()) && Objects.equals(getModelName(), vehicle.getModelName()) && Objects.equals(getManufacturingDate(), vehicle.getManufacturingDate()) && getStatus() == vehicle.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVehicleId(), getVehicleNumber(), getVehicleType(), getVehicleCompany(), getModelName(), getManufacturingDate(), getNoOfSeat(), getStatus());
    }

    public int getVehicleId() {
        return id;
    }

    public void setVehicleId(int id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleCompany() {
        return vehicleCompany;
    }

    public void setVehicleCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
