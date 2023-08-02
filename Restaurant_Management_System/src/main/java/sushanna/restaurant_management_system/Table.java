/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class Table {
    private int tableNumber;
    private int capacity;
    private boolean isOccupied;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = false;
    }

    // Getters and setters (omitted for brevity)
    // ...
    public int getTableNumber() {
        return this.tableNumber;
    }

    @Override
    public String toString() {
        return "Table: #" + tableNumber + ", Capacity: " + capacity + ", Occupied: " + isOccupied;
    }
}
