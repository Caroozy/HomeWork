package Chapter12unit7;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int bot=Integer.MAX_VALUE;
        System.out.println("enter any number and to exit the program type -999");
        int num= scanner.nextInt();
        while(num!=-999){
            if(bot>num){
                bot=num;
            }
            System.out.println("enter a number");
            num= scanner.nextInt();
        }
        System.out.println("the bottom number is: "+bot);
    }
}
