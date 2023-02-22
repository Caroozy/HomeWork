package series1;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>(FactoryUtils.initEmployees());
        Helper.report(employees);
    }
}
