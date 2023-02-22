package series2;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private static Company company=new Company();

    private final List<Employee>employees=new LinkedList<>();

    private Company(){
        this.employees.addAll(FactoryUtils.initEmployees());
    }
    public static Company getInstance(){
        return company;
    }
    public List<Employee> getEmployees(){
        return employees;
    }
    public void addEmployee(Employee employee){employees.add(employee);}


    public void removeEmployee(Employee employee){
        for (Employee employee1:employees){
            if (employee1.compareTo(employee)==0&&employee1.getSalary()==employee.getSalary()){
                employees.remove(employee);
                return;
            }
        }
    }
    public void display(){
        employees.sort(Employee::compareTo);
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }

    public double getAvgSalary(){
        if (employees.size()==0){
            return 0;
        }
        int salary=0;
        for (Employee employee:employees){
            salary+=employee.getSalary();
        }
        return salary/employees.size();
    }

    public double getManagementAvgSalary(){
        if (employees.size()==0){
            return 0;
        }
        int count=0;
        int salary=0;
        for (Employee employee:employees){
            if (employee instanceof Manager){
                salary+=employee.getSalary();
                count++;
            }
        }
        return salary/count;
    }

    public double getMonthlyPayment(){return getAvgSalary()*employees.size();}


    public double getYearlyPayment(){return getMonthlyPayment()*12;}

    public double getTotalNumOfEmployees(){return employees.size();}

    public double getTotalNumOfManagers(){
        int count=0;
        for (Employee employee:employees){
            if (employee instanceof Manager){
                count++;
            }
        }
        return count;
    }

}
