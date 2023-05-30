package com.machinecoding.Reservation;

import com.machinecoding.Location;
import com.machinecoding.User.User;
import com.machinecoding.Vehicle.Vehicle;

import java.util.Date;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Location pickupLocation;
    Location dropLocation;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.BYDAY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
}
