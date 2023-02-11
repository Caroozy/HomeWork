package C12_1;

public class E9 {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*51)+50;
        int num2=(int)(Math.random()*51)+50;
        System.out.println("numbers are:"+num1+" "+num2);
        int tmp=0;
        if(num2<num1){
            tmp=num2;
            num2=num1;
            num1=tmp;
        }
        for(int idx=num1;idx<=num2;idx++){
            System.out.print(idx+"-");
        }
    }
}
