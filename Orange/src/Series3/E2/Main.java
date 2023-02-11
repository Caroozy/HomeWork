package Series3.E2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("id please");
        long id= scanner.nextLong();
        System.out.println("how many seats?");
        int numOfSeats= scanner.nextInt();
        System.out.println("date the plane was created by the format yyyy-mm-dd");
        String date= scanner.next();
        LocalDate dateOfCreation=LocalDate.parse(date);
        System.out.println("date the last repairing the plane has gone through by the format yyyy-mm-dd");
        date= scanner.next();
        LocalDate lastRepairing=LocalDate.parse(date);
        Airplane one=new Airplane();
        Airplane two=new Airplane(id,numOfSeats,dateOfCreation);
        Airplane three=new Airplane(id,numOfSeats,dateOfCreation,lastRepairing);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
