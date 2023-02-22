package series2;

public class Helper {

    public static void report(){
        System.out.println("Number of employees: "+Company.getInstance().getTotalNumOfEmployees());
        System.out.println("Number of managers: "+Company.getInstance().getTotalNumOfManagers());
        System.out.println("Monthly payments: "+Company.getInstance().getMonthlyPayment());
        System.out.println("Yearly payments: "+Company.getInstance().getYearlyPayment());
        System.out.println("Average salary: "+Company.getInstance().getAvgSalary());
        System.out.println("Average managers salary: "+Company.getInstance().getManagementAvgSalary());
    }
}
