// Write a java Program to check whether given number is prime or not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The number is not prime");
        } else {
            System.out.println("The number is prime");
        }
        sc.close();
    }
}