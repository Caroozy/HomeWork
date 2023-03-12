package e2;

public abstract class Employee {
    private static double MAX_SALARY=40_000;

    private String name;

    private int age;

    private double salary;

    public Employee(String name, int age, double salary) throws InvalidEmployeeSalaryException {
        this.name = name;
        this.age = age;
        if (salary>MAX_SALARY){
            throw new InvalidEmployeeSalaryException("Salary above the maximum allowed");
        }
        this.salary = salary;
    }

    public static double getMaxSalary() {
        return MAX_SALARY;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}'+'\n';
    }
}
