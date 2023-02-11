package C10_3;

public class E3 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*1001)+5000;
        System.out.println("salary atm stands at: "+num);
        double sum = num;
        if(num*1.1>6000){
            sum= num*1.05;
        }else{
            sum=num*1.1;
        }
        System.out.println("after the raise the salary will be at: "+(int)sum);
        System.out.println("*not including the decimals*");
    }
}
