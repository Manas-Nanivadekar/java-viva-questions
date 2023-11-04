// Write a java Program to create a Student class with necessary variables
// inside it. In the main
// function declare its objects. Initialize them by adding the respective values
// and display on the
// screen

public class Student {
    String name;
    int age;
    String address;
    String contact;

    public Student(String name) {
        this.name = name;
    }

    public void stuAge(int stuAge) {
        age = stuAge;
    }

    public void stuAddress(String stuAddress) {
        address = stuAddress;
    }

    public void stuContact(String stuContact) {
        contact = stuContact;
    }

    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
    }

    public static void main(String args[]) {
        Student stuOne = new Student("Ransika");
        Student stuTwo = new Student("Nuwan");

        stuOne.stuAge(26);
        stuOne.stuAddress("Colombo");
        stuOne.stuContact("0771234567");
        stuOne.printStudent();

        stuTwo.stuAge(21);
        stuTwo.stuAddress("Kandy");
        stuTwo.stuContact("0777654321");
        stuTwo.printStudent();
    }
}