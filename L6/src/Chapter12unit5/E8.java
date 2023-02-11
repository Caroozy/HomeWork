package Chapter12unit5;

public class E8 {
    public static void main(String[] args) {
        int a=(int)(Math.random()*96)+5;
        int b=(int)(Math.random()*96)+5;
        int tmp;
        int a1=1;
        int a2=1;
        System.out.println(""+a+" "+b);
        if(a>b){
            tmp=b;
            b=a;
            a=tmp;
        }
        for(int idx=2;a2<=b;idx++){
            if(a2>a){
                System.out.print(a2+"-fn"+idx+"- ");
            }
            tmp=a1+a2;
            a1=a2;
            a2=tmp;
        }
    }
}
