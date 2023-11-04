// Write a java Program to create a Vehicle class with its necessary variables.
// The class must contain
// methods with different parameters to achieve the method overloading concept.
// In the main
// function, call the methods and display the results on the screen.

import java.util.Scanner;

public class Vehicle2 {
    String name;
    String type;
    String color;
    int year;
    double price;

    public Vehicle2(String name) {
        this.name = name;
    }

    public Vehicle2(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Vehicle2(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Vehicle2(String name, String type, String color, int year) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.year = year;
    }

    public Vehicle2(String name, String type, String color, int year, double price) {
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

        Vehicle2 v1 = new Vehicle2(name);
        Vehicle2 v2 = new Vehicle2(name, type);
        Vehicle2 v3 = new Vehicle2(name, type, color);
        Vehicle2 v4 = new Vehicle2(name, type, color, year);
        Vehicle2 v5 = new Vehicle2(name, type, color, year, price);

        v1.printVehicle();
        v2.printVehicle();
        v3.printVehicle();
        v4.printVehicle();
        v5.printVehicle();
        sc.close();
    }
}