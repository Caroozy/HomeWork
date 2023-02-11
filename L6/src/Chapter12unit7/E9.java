package Chapter12unit7;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the length");
        int len= scanner.nextInt();
        System.out.println("please enter the amount");
        int amo= scanner.nextInt();
        for(int idx=1;idx<=amo;idx++){
            for(int ser=1;ser<=len;ser++){
                System.out.print("*-");
            }
            System.out.println();
        }
    }
}
