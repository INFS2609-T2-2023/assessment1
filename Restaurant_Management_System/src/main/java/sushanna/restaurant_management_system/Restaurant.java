/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class Restaurant {
    private String name;
    private CuisineType cuisineType;
    private String address;
    private double averageRating;

    public Restaurant(String name, CuisineType cuisineType, String address, double averageRating) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.address = address;
        this.averageRating = averageRating;
    }

    // Getters and setters (omitted for brevity)
    // ...

    @Override
    public String toString() {
        return "Restaurant: " + name + ", Cuisine: " + cuisineType + ", Address: " + address + ", Rating: " + averageRating;
    }
}

