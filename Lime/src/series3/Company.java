package series3;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private static Company company = new Company();

    private final List<Employee> employees = new LinkedList<>();

    private Company() {
        this.employees.addAll(FactoryUtils.initEmployees());
    }

    public static Company getInstance() {
        return company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) throws CompanySystemException {
        if (employees.contains(employee)) {
            throw new CompanySystemException(Error.EMPLOYEE_ALREADY_EXIST.getMessage());
        }
        employees.add(employee);
    }


    public void removeEmployee(Employee employee) throws CompanySystemException {
        for (Employee employee1 : employees) {
            if (employee1.compareTo(employee) == 0 && employee1.getSalary() == employee.getSalary()) {
                employees.remove(employee);
                return;
            }
        }
        throw new CompanySystemException(Error.EMPLOYEE_NOT_FOUND.getMessage());
    }

    public void display() {
        employees.sort(Employee::compareTo);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double getAvgSalary() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
        int salary = 0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary / employees.size();
    }

    public double getManagementAvgSalary() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
        int count = 0;
        int salary = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                salary += employee.getSalary();
                count++;
            }
        }
        return salary / count;
    }

    public double getMonthlyPayment() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
        return getAvgSalary() * employees.size();
    }


    public double getYearlyPayment() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
        return getMonthlyPayment() * 12;
    }

    public double getTotalNumOfEmployees() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }
        return employees.size();
    }

    public double getTotalNumOfManagers() throws CompanySystemException {
        if (employees.size() == 0 || employees == null) {
            throw new CompanySystemException(Error.NULL_OR_EMPTY.getMessage());
        }

        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                count++;
            }
        }
        return count;
    }

}
