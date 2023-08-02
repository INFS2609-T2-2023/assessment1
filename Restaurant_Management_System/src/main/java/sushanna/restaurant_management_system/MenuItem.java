/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sushanna.restaurant_management_system;

/**
 *
 * @author sushannalu
 */
public class MenuItem {
        private FoodItem foodItem;
    private String description;

    public MenuItem(FoodItem foodItem, String description) {
        this.foodItem = foodItem;
        this.description = description;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MenuItem: " + description + ", " + foodItem;
    }
}
