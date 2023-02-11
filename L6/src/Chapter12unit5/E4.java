package Chapter12unit5;

public class E4 {
    public static void main(String[] args) {
        int a1=1;
        int a2=1;
        int tmp;
        int num=(int)(Math.random()*31)+10;
        System.out.println(num);
        for(int idx=2;idx<=num;idx++){
            if(a2%2==0){
                System.out.print(a2+"-fn"+idx+"- ");
            }
            tmp=a1+a2;
            a1=a2;
            a2=tmp;
        }
    }
}
