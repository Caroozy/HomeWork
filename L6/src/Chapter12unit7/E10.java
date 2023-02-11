package Chapter12unit7;

public class E10 {
    public static void main(String[] args) {
        int amount=1;
        for(int idx=2;idx<=8;idx+=2){
            for(int ser=1;ser<=idx;ser++){
                amount*=ser;
            }
            System.out.println(idx+" factorial is "+amount);
            amount=1;
        }
    }
}
