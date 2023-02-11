package C9_5;

public class E4 {
    public static void main(String[] args) {
        int num1= (int)(Math.random()*100)+1;
        int num2= (int)(Math.random()*100)+1;
        int top;
        int bot;
        if(num1>num2){
            top=num1;
            bot=num2;
        }else{
            top =num2;
            bot=num1;
        }
        System.out.println("the top number is "+top);
        System.out.println("the bottom number is "+bot);
        int sum=num1+num2;
        int avg=sum/2;
        System.out.println("the average is "+avg);
        System.out.println("the summary is "+sum);
        if(sum%2==0){
            System.out.println("the summary is even");
        }else{
            System.out.println("the summary is odd");
        }
    }
}
