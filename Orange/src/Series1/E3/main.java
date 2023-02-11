package Series1.E3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the id");
        long id= scanner.nextLong();
        System.out.println("enter the name");
        String name= scanner.next();
        System.out.println("enter the category");
        String category= scanner.next();
        item one=new item(id,name,100,category);
        item two=new item(name,category);
        System.out.println(one);
        System.out.println(two);
    }
}
