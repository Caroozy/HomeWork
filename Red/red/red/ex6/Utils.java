package red.ex6;

/**
 * Created by kobis on 10 Feb, 2022
 */
public class Utils {

    public static void print(Policeman[] policemens){
        for (int i = 0; i < policemens.length; i++) {
            System.out.println(policemens[i]);
        }
        System.out.println("------------------------------------");
    }

    public static void print(Criminal[] criminals){
        for (int i = 0; i < criminals.length; i++) {
            System.out.println(criminals[i]);
        }
        System.out.println("------------------------------------");
    }
}
