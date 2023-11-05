// Write a java program to demonstrate single inheritance

import java.util.Scanner;

class Vehicle {
    String name;
    String type;
    String color;
    int year;
    double price;

    public Vehicle(String name, String type, String color, int year, double price){
        this.name = name;
        this.type = type;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    
    public void printVehicle() {
    System.out.println("Vehicle name is "+name);
    System.out.println("Vehicle type is "+type);
    System.out.println("Vehicle color is "+color);
    System.out.println("Vehicle year is "+year);
    System.out.println("Vehicle price is "+price);
}
}

class Car extends Vehicle {
    String brand ;
    public Car (String name, String type, String color, int year, double price, String brand){
        super(name, type, color, year, price);
        this.brand = brand;
    }
        
        public void printCar() {
            super.printVehicle();
            System.out.println("Brand is "+brand);
        }
    }

public class SingleInheritance {
    public static void main(String[] args) {
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
        System.out.println("Enter brand of the Vehicle: ");
        String brand = sc.nextLine();

        Car c1 = new Car(name, type, color, year, price, brand);
        v.printCar();
        sc.close();
    }
}