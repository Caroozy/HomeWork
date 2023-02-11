package C10_3;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what number of season are we in?");
        int ses= scanner.nextInt(); // ses- season
        switch (ses){
            case 12:
            case 2:
            case 1:
                System.out.println("winter");
                break;
            case 3:
            case 5:
            case 4:
                System.out.println("autumn");
                break;
            case 6:
            case 8:
            case 7:
                System.out.println("summer");
                break;
            case 9:
            case 11:
            case 10:
                System.out.println("spring");
                break;
            default:
                System.out.println("not a month");
        }
    }
}
