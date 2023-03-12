package e2;

public class InvalidEmployeeSalaryException extends RuntimeException{
    public InvalidEmployeeSalaryException(String message){
        super(message);
    }
}
