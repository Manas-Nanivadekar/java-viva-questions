// Write a java program to demonstrate multilevel inheritance

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Labrador extends Dog {
    void display() {
        System.out.println("Labrador is a type of dog.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Labrador myLabrador = new Labrador();

        myLabrador.display(); // Accessing the Labrador class method
        myLabrador.bark(); // Accessing the Dog class method
        myLabrador.eat(); // Accessing the Animal class method
    }
}
