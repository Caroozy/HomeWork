package Chapter12unit5;

public class E9 {
    public static void main(String[] args) {
        int tmp;
        int top=Integer.MIN_VALUE;
        int a= (int)(Math.random()*96)+5;
        int b=(int)(Math.random()*96)+5;
        int a1=1;
        int a2=1;
        System.out.println(a+" "+b);
        if(a>b){
            tmp=b;
            b=a;
            a=tmp;
            System.out.println("new setup is: "+a+" "+b);
        }
        for(int idx=2;a2<=b;idx++){
            if(a2>a){
                System.out.print(a2+"fn"+idx+"- ");
            }
            if(a2%2==0){
                top=a2;
            }
            tmp=a1+a2;
            a1=a2;
            a2=tmp;
        }
        System.out.println();
        System.out.println("top number: "+top);
    }
}
