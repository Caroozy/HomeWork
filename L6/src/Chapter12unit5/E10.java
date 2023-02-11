package Chapter12unit5;

public class E10 {
    public static void main(String[] args) {
        int tmp;
        int num=(int)(Math.random()*101)+100;
        System.out.println(num);
        for(int idx=1;idx<=num;idx++){
            if(idx%7==0){
                System.out.println("boom");
            }else{
                for(tmp=idx;tmp>0;tmp/=10){
                    if(tmp%10==7){
                        System.out.println("boom");
                        break;
                    }
                }
                if(tmp==0){
                    System.out.print(idx+"-");
                }
            }
        }
    }
}
