/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class RestaurantLocation {
    private String name;
    private String address;

    public RestaurantLocation(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters (omitted for brevity)
    // ...

    @Override
    public String toString() {
        return "Restaurant Location: " + name + ", Address: " + address;
    }
}
