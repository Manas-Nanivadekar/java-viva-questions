// Write a java program to demonstrate single inheritance

import java.util.Scanner;

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
        Vehicle v = new Vehicle(name, type, color, year, price);
        v.printVehicle();
        sc.close();
    }
}