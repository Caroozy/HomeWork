package Series2.E5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("whats the id");
        int id= scanner.nextInt();
        System.out.println("whats the last name");
        String lastName= scanner.next();
        System.out.println("first name");
        String firstName= scanner.next();
        System.out.println("whats the average?");
        float average= scanner.nextFloat();
        System.out.println("whose his teacher?");
        String teacher= scanner.next();
        student one=new student();
        student two=new student(id,lastName,firstName,average,teacher);
        System.out.println(one);
        System.out.println(two);
        scanner.close();
    }
}
