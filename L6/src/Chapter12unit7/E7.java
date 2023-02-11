package Chapter12unit7;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int n= scanner.nextInt();
        for(int idx=1;idx<=n;idx++){
            for(int ser=idx;ser<=n;ser++){
                System.out.print(ser+"-");
            }
            System.out.println();
        }
    }
}
