import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract void displayDetails();
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    private double baseSalary;

    public FullTimeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.printf("Salary: $%.2f%n", calculateSalary());
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.printf("Salary: $%.2f%n", calculateSalary());
    }
}

// Employee management system class
class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("------------------------------");
        }
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 60000);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 20, 100);

        ems.addEmployee(fullTimeEmp);
        ems.addEmployee(partTimeEmp);

        ems.displayAllEmployees();
    }
}
