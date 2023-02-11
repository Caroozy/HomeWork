package C9_5;

public class E5 {
    public static void main(String[] args) {
        int top = Integer.MIN_VALUE;
        for (int idx = 1; idx <= 3; idx++) {
            int num = (int) (Math.random() * 550) + 201;
            System.out.println(num);
            if (num > top) {
                top = num;
            }
        }
        if (top % 2 == 0){
            String tmp = "even";
            System.out.printf("the top number is "+top+" and the number is "+tmp);
        }else{
            String tmp = "odd";
            System.out.printf("the top number is "+top+" and the number is "+tmp);
        }
    }
    }
