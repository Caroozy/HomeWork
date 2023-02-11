import java.util.Arrays;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        char[] arr = new char[5];
        Arrays.fill(arr, '-');
        int num = (int) (Math.random() * 16) + 1;
        char[] arrnum = new char[5];
        int numbinary = num;
        int counter = 16;
        for (int i = 0; i < arrnum.length; i++) {
            if (numbinary >= counter) {
                arrnum[i] = '1';
                numbinary -= counter;
            } else {
                arrnum[i] = '0';
            }
            counter /= 2;
        }
        Scanner scanner=new Scanner(System.in);
        int lines=arr.length;
        System.out.println("guess the number 1-16");
        int guess= scanner.nextInt();
        System.out.println();
        counter =0;
        while (guess!=num){
            if (counter== arrnum.length){
                for (int i=0;i< arrnum.length;i++){
                    System.out.print(arrnum[i]);
                }
                System.out.println();
                System.out.println("try again a number 1-16");
                guess= scanner.nextInt();
                continue;
            }
            for (int i=0;i< arr.length-counter;i++){
                System.out.print(arr[i]);
            }
            for (int i= arrnum.length-counter;i< arrnum.length;i++){
                System.out.print(arrnum[i]);
            }
            System.out.println();
            System.out.println("try again a number 1-16");
            guess= scanner.nextInt();
            counter++;
        }
        System.out.println();
        System.out.println(guess+" is the right number");
        System.out.println("thanks for trying my program");
    }
}