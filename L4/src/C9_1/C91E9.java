package C9_1;

import java.util.Scanner;

public class C91E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("are you sure you want to exit answer with Y or N");
        String ans = scanner.next();
        if (ans.length() == 1) {
            if (ans.contains("Y")){
                System.out.println("staying");
            }else if (ans.contains("N")) {
                System.out.println("exiting");
            } else {
                System.out.println("wtf");
            }
        } else {
            System.out.println("wtf");
        }
    }
}

