public class Intern extends Employee {
    // Define a constant for the maximum salary an intern can have.
    private static final int maxSalary = 20000;

    // Constructor for the Intern class.
    public Intern(String name, int age, int salary) {
        // Call the constructor of the superclass (Employee) with the provided name, age, and salary.
        super(name, age, salary);

        // Check if the provided salary exceeds the maximum allowed salary.
        if (salary > maxSalary) {
            // Throw an IllegalArgumentException if the salary is too high.
            throw new IllegalArgumentException("You cannot set a salary that exceeds " + maxSalary + " for " + name);
        }
    }

    // Method to update the salary of the intern.
    public void updateSalary(int newSalary) {
        // Check if the new salary is less than the maximum allowed salary.
        if (newSalary < 20000) {
            // Update the salary using the superclass's setSalary method.
            super.setSalary(newSalary);
        } else {
            // Throw an IllegalArgumentException if the new salary is too high.
            throw new IllegalArgumentException("You cannot set a salary that exceeds " + maxSalary + " for " + super.getName());
        }
    }
}
