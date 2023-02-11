package Chapter12.unit3;

public class E10 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100001);
        System.out.println(num);
        System.out.println("right number is: "+num%10);
        int count=0;
        int oppo=0;
        int sum=0;
        int idx;
        for(idx=num; idx>9;idx/=10){
            count++;
            sum+=idx%10;
            oppo=oppo*10+idx%10;
        }
        count++;
        sum+=idx;
        oppo=oppo*10+idx;
        System.out.println("the left number is: "+idx);
        System.out.println("number of letters: "+count);
        System.out.println("summary of numbers: "+sum);
        System.out.println(oppo);
        if(oppo==num){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
