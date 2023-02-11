package C12_1;

public class E8 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*51)+50;
        System.out.println(num);
        for(int idx=1;idx<=num;idx++){
            System.out.print(idx+"-");
        }
    }
}
