package Chapter12unit5;

public class E1 {
    public static void main(String[] args) {
        int a1=1;
        int a2=1;
        int tmp;
        System.out.print("1-(fn: 1)- 1-(fn: 2)- ");
        for(int idx=3;idx<=30;idx++){
            tmp=a1+a2;
            System.out.print(tmp+"-");
            a1=a2;
            a2=tmp;
            System.out.print("(fn: "+idx+")- ");
        }
    }
}
