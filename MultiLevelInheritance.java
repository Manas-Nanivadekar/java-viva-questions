// Define the first interface
interface InterfaceA {
    void methodA();
}

// Define the second interface
interface InterfaceB {
    void methodB();
}

// A class that implements both interfaces
class MultipleInheritanceClass implements InterfaceA, InterfaceB {
    // Implement method from InterfaceA
    public void methodA() {
        System.out.println("Method A");
    }

    // Implement method from InterfaceB
    public void methodB() {
        System.out.println("Method B");
    }
}

// Main class to run the example
public class MultiLevelInheritance {
    public static void main(String[] args) {
        MultipleInheritanceClass mic = new MultipleInheritanceClass();

        // Call method from InterfaceA
        mic.methodA();

        // Call method from InterfaceB
        mic.methodB();
    }
}
