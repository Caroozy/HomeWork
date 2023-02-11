package red.ex2;

/**
 * Created by kobis on 03 Feb, 2022
 */
public class Employee {

   private String firstName;
   private String lastName;
   private Date dateOfBirth;
   private Date dateOfHired;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Date dateOfBirth, Date dateOfHired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHired = dateOfHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfHired=" + dateOfHired +
                '}';
    }

}
