package C9_5;

import java.util.Random;

public class E7 {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int idx=1;idx<=3;idx++){
            int num= rand.nextInt();
            int sqrt= (int)Math.sqrt(num);
            System.out.println(sqrt);
        }
    }
}
