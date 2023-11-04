// Write a java Program to convert temperature in fahrenheit to celsius and vice
// versa

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float f = sc.nextFloat();
        float c = (f - 32) * 5 / 9;
        System.out.println("Temperature in celsius is: " + c);
        System.out.println("Enter the temperature in celsius: ");
        float c1 = sc.nextFloat();
        float f1 = (c1 * 9 / 5) + 32;
        System.out.println("Temperature in fahrenheit is: " + f1);
        sc.close();
    }
}