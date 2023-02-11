package series2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("the line you will insert will appear backwards-to exit insert 0");
        String str= scanner.next();
        int index;
        String newString;
        //type 0 to exit program
        while (str!="0"){
            index=0;
            newString="";
            System.out.println(reverse(str,index,newString));
            System.out.println("the line you will insert will appear backwards-to exit insert 0");
            str= scanner.next();
        }
    }
    public static String reverse(String str,int index,String newString){
        char tmp; //tempo char
        if (index==str.length()){    //returns the opposite String when finished going through all the original String characters
            return newString;
        }
        newString+=str.charAt(str.length()-1-index); //takes last character and adds it to the oppo string
        index++;
        return reverse(str,index,newString); //recurring method until break line reached(index==str.length())
    }
}
