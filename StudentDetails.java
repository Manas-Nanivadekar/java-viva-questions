// Write a java Program to input name, age and class of a student and display
// the same on the screen

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the age of the student");
        int age = sc.nextInt();
        System.out.println("Enter the class of the student");
        int cls = sc.nextInt();
        System.out.println("The name of the student is " + name);
        System.out.println("The age of the student is " + age);
        System.out.println("The class of the student is " + cls);
        sc.close();
    }
}
