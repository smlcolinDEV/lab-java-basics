public class Employee {
    // Private fields to store the employee's name, age, and salary.
    private String name;
    private int age;
    private int salary;

    // Constructor to initialize the Employee object with name, age, and salary.
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter method for the name field.
    public String getName() {
        return name;
    }

    // Setter method for the name field.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age field.
    public int getAge() {
        return age;
    }

    // Setter method for the age field.
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for the salary field.
    public int getSalary() {
        return salary;
    }

    // Setter method for the salary field.
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Override the toString method to provide a string representation of the Employee object.
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
