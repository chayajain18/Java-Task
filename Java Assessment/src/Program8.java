class Program8 {
    private final String finalname;
    private final int finalemployeeId;

    public Program8 (String name, int employeeId) {
        this.finalname = name;
        this.finalemployeeId = employeeId;
    }

    public void displayInfo() {
        System.out.println("Name: " + finalname);
        System.out.println("Employee ID: " + finalemployeeId);
    }
}

class Manager extends Program8 {
    private final String finaldepartment;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.finaldepartment = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + finaldepartment);
    }
}

class Developer extends Program8 {
    private final String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}




