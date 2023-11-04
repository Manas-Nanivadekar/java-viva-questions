// Write a java Program to create an Employee class with necessary variables
// inside it. In the main
// function declare its objects. Initialize them by adding the respective values
// and display on the
// screen.

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        Employee empOne = new Employee("Ransika");
        Employee empTwo = new Employee("Nuwan");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}