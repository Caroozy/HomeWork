package Chapter12unit7;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int n= scanner.nextInt();
        for(int idx=n;idx>=1;idx--){
            for(int ser=1;ser<=idx;ser++){
                System.out.print(ser+"-");
            }
            System.out.println();
        }
    }
}
