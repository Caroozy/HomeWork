package C9_3;

public class C93E5 {
    public static void main(String[] args) {
        int sum=0;
        int top = Integer.MIN_VALUE;
        for(int idx=1;idx<=3;idx++){
            int num= (int)(Math.random()*550)+201;
            sum+=num;
            System.out.println(num);
            if (num>top){
                top=num;
            }
        }
        System.out.println(top);

    }
}
