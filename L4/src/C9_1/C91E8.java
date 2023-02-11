package C9_1;

import java.util.Scanner;

public class C91E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bot = Integer.MAX_VALUE;
        for(int idx= 1; idx<=3;idx++){
            System.out.println("enter number");
            int num=scanner.nextInt();
            if(bot>num){
                bot=num;
            }
        }
        System.out.println(bot);
    }
}
