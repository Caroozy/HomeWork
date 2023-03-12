package e2;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class SalesPerson extends Employee implements Comparable<SalesPerson>{

    private String certificationNumber;

    public SalesPerson(String name, int age, double salary, String certificationNumber) throws InvalidEmployeeSalaryException, ParseException {
        super(name, age, salary);
        MaskFormatter maskFormatter=new MaskFormatter("???-###");
        if (!maskFormatter.equals(certificationNumber)){
            throw new InvalidEmployeeSalaryException("certification format not allowed");
        }
        this.certificationNumber = certificationNumber;
    }

    @Override
    public int compareTo(SalesPerson o) {
        if(this.getSalary()>o.getSalary()){
            return 1;
        }else if(this.getSalary()<o.getSalary()){
            return -1;
        }
        return 0;
    }
}
