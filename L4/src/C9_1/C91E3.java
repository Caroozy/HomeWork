package C9_1;

import java.util.Scanner;

public class C91E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx=1;
        float sum =0;  // summary
        float avg =0; // average
        for(idx=1;idx<=3;idx++){
            System.out.println("put number");
            float num = scanner.nextFloat();
            sum+=num;
        }
        avg= sum/idx;
        System.out.println(avg);
    }
}
