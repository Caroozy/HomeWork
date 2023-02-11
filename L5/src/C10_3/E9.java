package C10_3;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what year?");
        int y = scanner.nextInt();
        System.out.println("what month?");
        int m = scanner.nextInt();
        switch (m){
            case 12:
            case 10:
            case 8:
            case 7:
            case 5:
            case 3:
            case 1:
                System.out.println("31 days");
                System.out.println("at the year "+y);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                System.out.println("at the year "+y);
                break;
            case 2:
                if(((y%4==0) && (y%100!=0))||((y%4==0)&&(y%400==0))){  // 4th year
                    System.out.println("29 days");
                    System.out.println("in the year "+y);
                    break;
                }else{
                    System.out.println("28 days");
                    System.out.println("in the year "+y);
                }
                break;
            default:
                System.out.println("not a month");
        }
    }
}
