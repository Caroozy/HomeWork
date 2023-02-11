package Chapter12.unit3;

public class E3 {
    public static void main(String[] args) {
        int sum=1;
        int num=(int)(Math.random()*7)+1;
        int idx=1;
        System.out.println(num);
        while(idx<=num){
            sum*=idx;
            idx++;
        }
        System.out.println(sum);
    }
}
