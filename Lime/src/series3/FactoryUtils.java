package series3;

import java.util.ArrayList;
import java.util.List;

public class FactoryUtils {

    //o Secretary – 7000 – 8500
    //
    //o Engineer – 9000 – 11000
    //
    //o Manager – 12000 – 15500
    //
    //o Director – 18000 – 35000
    public static double randSalary(int min, int max) {
        return (int) (Math.random() * (max - min)) + min + 1;
    }

    public static List<Employee> initEmployees() {
        List<Employee> employeeList = new ArrayList<>(10);

        for (int i=0;i<2;i++){
            employeeList.add(new Engineer(Name.getRandomName(),randSalary(9000,11000),"Conspiracy"));
            employeeList.add(new Engineer(Name.getRandomName(),randSalary(9000,11000),"Truth"));
            employeeList.add(new Secretary(Name.getRandomName(),randSalary(7000,8500),"Top G"));
            employeeList.add(new Manager(Name.getRandomName(),randSalary(12000,15500),"Mind Control"));
        }
        employeeList.add(new Engineer(Name.getRandomName(),randSalary(9000,11000),"In-between"));
        employeeList.add(new Director(Name.getRandomName(),randSalary(18000,35000),"Money","Finance"));

        return employeeList;
    }
}
