package Chapter12.unit3;

public class E4 {
    public static void main(String[] args) {
        int sum=1;
        int num=(int)(Math.random()*7)+1;
        int idx=num;
        System.out.println(num);
        while(idx>=1){
            sum*=idx;
            idx--;
        }
        System.out.println(sum);
    }
}
