// Write a java program to demonstrate hierarchical inheritance.

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myCat.eat(); // Accessing the eat method from Animal (base class)
        myCat.meow(); // Accessing the meow method from Cat
        System.out.println();
        myDog.eat(); // Accessing the eat method from Animal (base class)
        myDog.bark(); // Accessing the bark method from Dog
    }
}
