package C10_3;

public class E7 {
    public static void main(String[] args) {
        int year=(int)(Math.random()*2024);
        System.out.println(year);
        if((year%4==0) && ((year%100)!=0)||((year%4==0)&&(year%400==0))){
            System.out.println("shana meuberet");
        }else{
            System.out.println("lo shana meuberet");
        }
    }
}
