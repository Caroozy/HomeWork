package red.ex6;

/**
 * Created by kobis on 10 Feb, 2022
 */
public class Test {

    public static void main(String[] args) {
        Criminal c1 = new Criminal("Kobi", 3);
        Criminal c2 = new Criminal("Ilan", 10);
        Criminal c3 = new Criminal("Yaniv", 4);
        Criminal c4 = new Criminal("Daniel", 17);
        Criminal c5 = new Criminal("Dolve", 6);
        Criminal c6 = new Criminal("Ariel", 55);
        Criminal[] criminals = {c1, c2, c3, c4, c5, c6};
        System.out.println("----------------------------------------");
        Policeman p1 = new Policeman("Yarin", 10);
        Policeman p2 = new Policeman("Elad", 18);
        Policeman p3 = new Policeman("Omer", 13);
        Policeman[] policemens = {p1, p2, p3};


        Utils.print(policemens);
        Utils.print(criminals);

        for (int i = 0; i < policemens.length; i++) {
            for (int j = 0; j < criminals.length; j++) {
                policemens[i].arrest(criminals[j]);
            }
        }




        Utils.print(policemens);
        Utils.print(criminals);


    }
}
