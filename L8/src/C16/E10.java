package C16;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("whats the hour?");
        int h= scanner.nextInt();
        System.out.println("whats the minutes?");
        int m= scanner.nextInt();
        System.out.println("whats the seconds?");
        int s= scanner.nextInt();
        clock(h,m,s);
    }
    public static void clock(int h,int m,int s){
        System.out.print(h);
        System.out.print(":");
        if (m<10){
            System.out.print("0");
        }
        System.out.print(m);
        System.out.print(":");
        if (s<10){
            System.out.print("0");
        }
        System.out.print(s);
    }
}