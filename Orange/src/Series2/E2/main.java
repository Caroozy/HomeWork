package Series2.E2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what's the id?");
        long id= scanner.nextLong();
        System.out.println("whats the model?");
        String model= scanner.next();
        System.out.println("what's the manufacturer?");
        String manufacturer= scanner.next();
        System.out.println("does the printer has colors?");
        String colors= scanner.next();
        boolean isColorful;
        if (colors=="yes"){
            isColorful=true;
        }else{
            isColorful=false;
        }
        printer one=new printer();
        printer two=new printer(id,model,manufacturer);
        printer three=new printer(id,model,manufacturer,isColorful);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
