package Chapter12unit5;

public class E7 {
    public static void main(String[] args) {
        int sum=1;
        int tmp;
        int a1=1;
        int a2=1;
        int idx;
        int num= (int)(Math.random()*31)+10;
        System.out.println(num);
        System.out.print(a1+"fn1- ");
        for(idx=2; idx<=num;idx++){
            sum+=a2;
            System.out.print(a2+"-fn"+idx+"- ");
            tmp=a1+a2;
            a1=a2;
            a2=tmp;
        }
        System.out.println();
        System.out.println("the summary is: "+sum);
        System.out.println("the average is: "+sum/idx);
    }
}
