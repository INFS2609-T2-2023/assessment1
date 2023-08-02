/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class FoodItem implements Orderable{
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Implementing the Orderable interface method to get the price
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FoodItem: " + name + ", Price: $" + price;
    }

}
