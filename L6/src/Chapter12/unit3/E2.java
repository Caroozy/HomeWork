package Chapter12.unit3;

public class E2 {
    public static void main(String[] args) {
        int sum=1;
        int num = (int)(Math.random()*7)+1;
        System.out.println(num);
        for(int idx=num;idx>=1;idx--){
            sum*=idx;
        }
        System.out.println(sum);
    }
}
