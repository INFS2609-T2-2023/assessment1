/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class Reservation {
    private String customerName;
    private int partySize;
    private String date;
    private String time;

    public Reservation(String customerName, int partySize, String date, String time) {
        this.customerName = customerName;
        this.partySize = partySize;
        this.date = date;
        this.time = time;
    }

    // Getters and setters (omitted for brevity)
    // ...

    @Override
    public String toString() {
        return "Reservation for " + partySize + " people on " + date + " at " + time + " for " + customerName;
    }

}
