// Write a java Program to create a Vehicle class with its necessary variables.
// The class must contain
// constructors with different parameters to achieve the overloading concept. In
// the main function,
// accept values for the declared variables using these constructors and display
// the results on the
// screen.

import java.util.Scanner;

public class Vehicle {
    String name;
    String type;
    String color;
    int year;
    double price;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Vehicle(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Vehicle(String name, String type, String color, int year) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.year = year;
    }

    public Vehicle(String name, String type, String color, int year, double price) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void printVehicle() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the vehicle: ");
        String name = sc.nextLine();
        System.out.println("Enter the type of the vehicle: ");
        String type = sc.nextLine();
        System.out.println("Enter the color of the vehicle: ");
        String color = sc.nextLine();
        System.out.println("Enter the year of the vehicle: ");
        int year = sc.nextInt();
        System.out.println("Enter the price of the vehicle: ");
        double price = sc.nextDouble();

        Vehicle vehicleOne = new Vehicle(name);
        Vehicle vehicleTwo = new Vehicle(name, type);
        Vehicle vehicleThree = new Vehicle(name, type, color);
        Vehicle vehicleFour = new Vehicle(name, type, color, year);
        Vehicle vehicleFive = new Vehicle(name, type, color, year, price);

        vehicleOne.printVehicle();
        vehicleTwo.printVehicle();
        vehicleThree.printVehicle();
        vehicleFour.printVehicle();
        vehicleFive.printVehicle();
        sc.close();
    }
}