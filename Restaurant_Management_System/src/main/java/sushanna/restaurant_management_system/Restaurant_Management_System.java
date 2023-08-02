/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sushanna.restaurant_management_system;

import java.sql.*;

/**
 *
 * @author sushannalu
 */
public class Restaurant_Management_System {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:restaurant_db.db";

        try (Connection connection = DriverManager.getConnection(url)) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
            // Create tables in the database
//            createTables(connection);

            // Create a restaurant location
            RestaurantLocation location = new RestaurantLocation("Restaurant XYZ", "123 Main St");
//            insertRestaurantLocation(connection, location);

            // Create a few food items
            FoodItem chickenKaraage = new FoodItem("Chicken Karaage", 10.99);
            FoodItem prawnGyoza = new FoodItem("Prawn Gyoza", 8.99);
            FoodItem takoyaki = new FoodItem("Takoyaki", 5.99);
            FoodItem edaname = new FoodItem("Edaname", 3.99);
            FoodItem misoSoup = new FoodItem("Miso Soup", 4.50);
            FoodItem sushiRollPlatter = new FoodItem("Sushi Roll Platter", 39.99);
            FoodItem sushiAndSashimiPlatter = new FoodItem("Sushi and Sashimi Platter", 39.99);
            FoodItem japaneseGreenTeaIceCream = new FoodItem("Japanese Green Tea Ice Cream", 4.99);

            // Insert food items into the database
//            insertFoodItem(connection, chickenKaraage);
//            insertFoodItem(connection, prawnGyoza);
//            insertFoodItem(connection, takoyaki);
//            insertFoodItem(connection, edaname);
//            insertFoodItem(connection, misoSoup);
//            insertFoodItem(connection, sushiRollPlatter);
//            insertFoodItem(connection, sushiAndSashimiPlatter);
//            insertFoodItem(connection, japaneseGreenTeaIceCream);

            // Create a few menu items
            MenuItem menuItem1 = new MenuItem(chickenKaraage, "Chicken Karaage");
            MenuItem menuItem2 = new MenuItem(prawnGyoza, "Prawn Gyoza");
            MenuItem menuItem3 = new MenuItem(takoyaki, "Takoyaki");
            MenuItem menuItem4 = new MenuItem(edaname, "Edaname");
            MenuItem menuItem5 = new MenuItem(misoSoup, "Miso Soup");
            MenuItem menuItem6 = new MenuItem(sushiRollPlatter, "Sushi Roll Platter");
            MenuItem menuItem7 = new MenuItem(sushiAndSashimiPlatter, "Sushi and Sashimi Platter");
            MenuItem menuItem8 = new MenuItem(japaneseGreenTeaIceCream, "Japanese Green Tea Ice Cream");

            // Insert menu items into the database
//            insertMenuItem(connection, menuItem1);
//            insertMenuItem(connection, menuItem2);
//            insertMenuItem(connection, menuItem3);
//            insertMenuItem(connection, menuItem4);
//            insertMenuItem(connection, menuItem5);
//            insertMenuItem(connection, menuItem6);
//            insertMenuItem(connection, menuItem7);
//            insertMenuItem(connection, menuItem8);

            // Create a table
            Table table1 = new Table(1, 4);
            Table table2 = new Table(2, 6);

            // Insert tables into the database
//            insertTable(connection, table1);
//            insertTable(connection, table2);

            // Create a reservation
            Reservation reservation1 = new Reservation("John Doe", 4, "2023-08-02", "18:30");
            Reservation reservation2 = new Reservation("Jane Smith", 6, "2023-08-02", "19:00");

            // Insert reservations into the database
//            insertReservation(connection, reservation1, table1);
//            insertReservation(connection, reservation2, table2);

            // Create an order
            MenuItem[] items1 = {menuItem1, menuItem2};
            MenuItem[] items2 = {menuItem1, menuItem3};
            Order order1 = new Order(table1, "18:45", items1);
            Order order2 = new Order(table2, "19:15", items2);

            // Insert orders into the database
//            insertOrder(connection, order1);
//            insertOrder(connection, order2);

            // Print restaurant information
            System.out.println(location);

            // Print menu items
            System.out.println(menuItem1);
            System.out.println(menuItem2);
            System.out.println(menuItem3);

            // Print tables and reservations
            System.out.println(table1);
            System.out.println(reservation1);
            System.out.println(table2);
            System.out.println(reservation2);

            // Print orders
            System.out.println(order1);
            System.out.println(order2);

    }
}

