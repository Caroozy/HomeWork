package C16;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first name");
        String first= scanner.next();
        System.out.println("enter last name");
        String last= scanner.next();
        name(first,last);
        name(first,last);
    }
    static void name(String first,String last){
        System.out.println(first+" "+last);
    }
}
