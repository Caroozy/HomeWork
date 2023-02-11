package Series3.E1;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("the flights code?");
        String code= scanner.next();
        System.out.println("the company?");
        String company= scanner.next();
        System.out.println("where from?");
        String from= scanner.next();
        System.out.println("where to?");
        String to= scanner.next();
        System.out.println("what's the date in the format of yyyy-mm-dd");
        String date= scanner.next();
        LocalDate when=LocalDate.parse(date);
        flight one=new flight(code,company,from,to);
        flight two=new flight(code,company,from,to,when);
        System.out.println(one);
        System.out.println(two);
    }
}
