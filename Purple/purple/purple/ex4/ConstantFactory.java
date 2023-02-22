package purple.ex4;

/**
 * Created by kobis on 23 Dec, 2022
 */
public class ConstantFactory {

    private static final String[] names = {"Jonny","Gal","Moshe","Ravid","Tal"};
    private static final String[] dogs = {"Dogush","Dogidog","Dogaldo","Dogile","Doginiiho","Doginoin","Dogxer","Dogolon","Dogonihikio","Dogio"};
    private static final String[] colors = {"White","Brown","Black","Dotted","Leopard Stripes"};
    private static final String[] gardens = {"Dog Kingdom","Dog Heaven","Funfunfun Place!"};

    public static String randomHumanName(){
        return names[(int)(Math.random()*names.length)];
    }

    public static float randomWeight(){
        return (float) (Math.random()*5.6 + 3.2);
    }

    public static String randomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    public static String randomDogName(){
        return dogs[(int)(Math.random()*dogs.length)];
    }

    public static String randomGardenName(){
        return gardens[(int)(Math.random()*gardens.length)];
    }
}
