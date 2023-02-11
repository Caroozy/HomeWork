package Series1.E1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your id");
        int id= scanner.nextInt();
        System.out.println("enter your last name");
        String lastName=scanner.next();
        System.out.println("enter your first name");
        String firstName= scanner.next();
        System.out.println("enter your city");
        String city= scanner.next();
        System.out.println("are you smoking? press 1-yes or any other number for no");
        int smoking= scanner.nextInt();
        boolean isSmoking=false;
        if (smoking==1){
            isSmoking=true;
        }
        person var1 = new person();
        person var2=new person(id,lastName,firstName);
        person var3=new person(id,lastName,firstName,city,isSmoking);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        scanner.close();
    }
}
