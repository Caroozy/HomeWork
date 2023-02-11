package Series1.E4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("name");
        String name= scanner.next();
        System.out.println("weight");
        float weight= scanner.nextFloat();
        dog one=new dog();
        dog two=new dog(name,weight);
        dog three=new dog(name,weight,"black");
        dog four=new dog(name,weight,"black",true);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}
