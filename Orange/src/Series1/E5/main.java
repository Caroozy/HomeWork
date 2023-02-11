package Series1.E5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("name");
        String name= scanner.next();
        fish one=new fish();
        fish two=new fish(name,"yellow");
        fish three=new fish(name,"yellow",60);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        scanner.close();
    }
}
