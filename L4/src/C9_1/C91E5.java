package C9_1;

import java.util.Scanner;

public class C91E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name starts with M please");
        String name = scanner.next();
        if (name.indexOf("M")== 0){
        System.out.println("nice");
        }
        else {
            System.out.println("not nice");
        }


    }
}
