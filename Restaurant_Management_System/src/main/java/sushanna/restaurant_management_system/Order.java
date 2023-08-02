/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class Order {
    private Table table;
    private String orderTime;
    private MenuItem[] items;

    public Order(Table table, String orderTime, MenuItem[] items) {
        this.table = table;
        this.orderTime = orderTime;
        this.items = items;
    }

    public Table getTable() {
        return table;
    }

    // Calculate the total price of the order
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (MenuItem item : items) {
            totalPrice += item.getFoodItem().getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order for Table: #" + table.getTableNumber() + ", Order Time: " + orderTime + ", Total Price: $" + calculateTotalPrice();
    }
}
