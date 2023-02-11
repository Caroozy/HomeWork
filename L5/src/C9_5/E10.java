package C9_5;

public class E10 {
    public static void main(String[] args) {
        int top= Integer.MIN_VALUE;
        for(int idx=1;idx<=5;idx++){
            int num=(int)(Math.random()*10)+11;
            if(num>top){
                top=num;
            }
            System.out.println(num);
        }
        System.out.println(top);
    }
}
