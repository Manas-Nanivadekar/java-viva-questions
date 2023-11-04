// Write a java Program to create an Employee class with variables lille id,
// basic salary (BS),etc.
// inside it. In the main function declare objects for 2 employees. Initialize
// them by adding the
// respective values and calculate the Gross Salary (GS) (GS=BS+0.3*BS+1.25*BS)

public class GrossSalary {
    int id;
    double basicSalary;
    double grossSalary;

    public GrossSalary(int id) {
        this.id = id;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void calculateGrossSalary() {
        grossSalary = basicSalary + 0.3 * basicSalary + 1.25 * basicSalary;
    }

    public void printGrossSalary() {
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String args[]) {
        GrossSalary empOne = new GrossSalary(1);
        GrossSalary empTwo = new GrossSalary(2);

        empOne.setBasicSalary(1000);
        empOne.calculateGrossSalary();
        empOne.printGrossSalary();

        empTwo.setBasicSalary(500);
        empTwo.calculateGrossSalary();
        empTwo.printGrossSalary();
    }
}