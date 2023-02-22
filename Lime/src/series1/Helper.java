package series1;

import java.util.List;

public class Helper {
    public static double avgSalary(List<Employee> employees) {
        if (employees.size()==0){return 0;}
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total / employees.size();
    }

    public static double avgManagementSalary(List<Employee> employees) {
        if (employees.size()==0){return 0;}
        int total = 0;
        int count=0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                total += employee.getSalary();
                count++;
            }
        }
        return total/count;
    }
    public static void display(List<Employee>employees){
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }

    public static void report(List<Employee>employees){
        System.out.println("Average salary: "+avgSalary(employees));
        System.out.println("Average management salary: "+avgManagementSalary(employees));
        display(employees);
    }
}
