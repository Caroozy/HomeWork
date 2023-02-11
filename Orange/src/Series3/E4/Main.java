package Series3.E4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("whats the id?");
        int id= scanner.nextInt();
        System.out.println("title");
        String title= scanner.next();
        System.out.println("description");
        String description = scanner.next();
        System.out.println("date in the format of yyyy-mm-dd");
        String date= scanner.next();
        LocalDate startDate=LocalDate.parse(date);
        System.out.println("end date in the format of yyyy-mm-dd");
        date= scanner.next();
        LocalDate endDate=LocalDate.parse(date);
        System.out.println("amount");
        int amount= scanner.nextInt();
        System.out.println("price");
        long price= scanner.nextLong();
        Coupon one=new Coupon(title,description,startDate,endDate,amount,price);
        Coupon two=new Coupon(id,title,description,startDate,endDate,amount,price);
        System.out.println(one);
        System.out.println(two);
    }
}
