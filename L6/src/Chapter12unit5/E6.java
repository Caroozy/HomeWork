package Chapter12unit5;

public class E6 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*31)+10;
        int a1=1;
        int a2=1;
        int tmp;
        int sum=1;
        System.out.println(num);
        System.out.print(a1+"-fn1- ");
        for(int idx=2;idx<=num;idx++){
            System.out.print(a2+"-fn"+idx+"- ");
            sum+=a2;
            tmp=a1+a2;
            a1=a2;
            a2=tmp;
        }
        System.out.println();
        System.out.println("summary: "+sum);
    }
}
