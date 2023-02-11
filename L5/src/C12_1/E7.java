package C12_1;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        for(int idx=2; idx<=num;idx=idx+2){
            System.out.println(idx);
        }
    }
}
