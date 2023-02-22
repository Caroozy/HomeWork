package purple.ex5;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class Shark extends Fish{

    private int numOfTeeth;

    public Shark(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
        this.speed = 120;
    }

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "speed=" + speed +
                ", numOfTeeth=" + numOfTeeth +
                "} " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("Yummy Yummy Yummy");
    }

    @Override
    public void draw() {
        System.out.println("" +
                "                                 ,-\n" +
                "                               ,'::|\n" +
                "                              /::::|\n" +
                "                            ,'::::o\\                                      _..\n" +
                "         ____........-------,..::?88b                                  ,-' /\n" +
                " _.--\"\"\"\". . . .      .   .  .  .  \"\"`-._                           ,-' .;'\n" +
                "<. - :::::o......  ...   . . .. . .  .  .\"\"--._                  ,-'. .;'\n" +
                " `-._  ` `\":`:`:`::||||:::::::::::::::::.:. .  \"\"--._ ,'|     ,-'.  .;'\n" +
                "     \"\"\"_=--       //'doo.. ````:`:`::::::::::.:.:.:. .`-`._-'.   .;'\n" +
                "         \"\"--.__     P(       \\               ` ``:`:``:::: .   .;'\n" +
                "                \"\\\"\"--.:-.     `.                             .:/\n" +
                "                  \\. /    `-._   `.\"\"-----.,-..::(--\"\".\\\"\"`.  `:\\\n" +
                "                   `P         `-._ \\          `-:\\          `. `:\\\n" +
                "                                   \"\"            \"            `-._)  -Seal\n");
    }
}
