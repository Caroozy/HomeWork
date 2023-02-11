package Chapter12unit7;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int idx;
        System.out.println("enter any number and at any time press 0 to exit the program");
        int num= scanner.nextInt();
        while(num!=0){
            for(idx=2;idx<=Math.sqrt(num);idx++){
                if(num%idx==0){
                    System.out.println("not a prime number");
                    break;
                }
            }
            if(idx>Math.sqrt(num)){
                System.out.println("prime number");
            }
            System.out.println("enter a number");
            num= scanner.nextInt();
        }
    }
}
