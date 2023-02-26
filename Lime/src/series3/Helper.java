package series3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {

    public static void report() throws CompanySystemException {
        System.out.println("Number of employees: "+ Company.getInstance().getTotalNumOfEmployees());
        System.out.println("Number of managers: "+ Company.getInstance().getTotalNumOfManagers());
        System.out.println("Monthly payments: "+ Company.getInstance().getMonthlyPayment());
        System.out.println("Yearly payments: "+ Company.getInstance().getYearlyPayment());
        System.out.println("Average salary: "+ Company.getInstance().getAvgSalary());
        System.out.println("Average managers salary: "+ Company.getInstance().getManagementAvgSalary());
    }

    public static String format(LocalDateTime time){
        return time.format(DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss"));
    }
}
