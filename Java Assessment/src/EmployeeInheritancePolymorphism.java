public class EmployeeInheritancePolymorphism {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, "HR");
        Developer developer = new Developer("Bob", 201, "Java");

        System.out.println("Manager:");
        manager.displayInfo();

        System.out.println("\nDeveloper:");
        developer.displayInfo();
    }
}
