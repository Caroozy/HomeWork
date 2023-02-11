package Chapter12.unit3;

public class E7 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*10001);
        int idx;
        System.out.println(num);
        for(idx=num;idx>10;idx/=10){
        }
        System.out.println(idx);
    }
}
