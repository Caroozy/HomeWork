package C9_3;

public class C93E2 {
    public static void main(String[] args) {
        int sum=0;
        for(int idx=1;idx<=3;idx++){
            int num=(int)(Math.random()*10)+1;
            sum+=num;
            System.out.println(num);
        }
        int avg = sum/3;
        System.out.println(avg);
    }
}
