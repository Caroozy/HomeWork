package Chapter12.unit3;

public class E5 {
    public static void main(String[] args) {
        int length =0;
        int num= (int)(Math.random()*10_001);
        System.out.println(num);
        for(int idx=0;idx<=num;idx++){
            length++;
            num/=10;
        }
        System.out.println(length);
    }
}
