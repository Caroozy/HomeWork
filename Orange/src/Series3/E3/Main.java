package Series3.E3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what's the id?");
        long id= scanner.nextLong();
        System.out.println("title");
        String title= scanner.next();
        System.out.println("description");
        String description= scanner.next();
        System.out.println("account id");
        long accountId= scanner.nextLong();
        System.out.println("when? format: yyyy-mm-dd");
        String date=scanner.next();
        LocalDate when=LocalDate.parse(date);
        Log one=new Log();
        Log two=new Log(id,title,description,accountId);
        Log three=new Log(id,title,description,accountId,when);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        scanner.close();
    }
}
