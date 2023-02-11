package C10_3;

public class E1 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*101);
        System.out.println(num);
        if(num>50){
            System.out.println("big");
        }else if(num<50){
            System.out.println("small");
        }else{
            System.out.println("bingo");
        }
    }
    }
