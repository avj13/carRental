package com.machinecoding.Billing;

import com.machinecoding.Reservation.Reservation;

public class Bill {
    int billId;
    Reservation reservation;
    double billAmount;
    boolean isBillPaid;

    public Bill(int billId, Reservation reservation, double billAmount, boolean isBillPaid) {
        this.billId = billId;
        this.reservation = reservation;
        this.billAmount = billAmount;
        this.isBillPaid = isBillPaid;
    }

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.billAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount(){
        // based on reservation start and end, vehicle daily/hourly price,
        return 100.0;
    }

}
