package series3;

public class Test {
    public static void main(String[] args) throws CompanySystemException {
        Company c1= Company.getInstance();
        c1.display();
        Helper.report();
    }
}
