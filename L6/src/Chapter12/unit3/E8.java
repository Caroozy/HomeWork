package Chapter12.unit3;

public class E8 {
    public static void main(String[] args) {
        int oppo=0;
        int num=(int)(Math.random()*10001);
        System.out.println(num);
        for(int idx=num;idx>0;idx/=10){
            oppo=oppo*10+idx%10;
        }
        System.out.println(oppo);
    }
}
