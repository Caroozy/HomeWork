package series4;

public class ConstantFactory {
    public static String randomHumanName(){

        String[]names={"Jonny","Gal","Moshe","Ravid","Tal"};
        int random=(int)(Math.random()* names.length);
        return names[random];
    }
    public static float randomWeight(){return (float)((Math.random()*5.7)+3.2);}

    public static String randomColor(){
        String[]names={"White","Brown","Black","Dotted","Leopard Stripes"};
        return names[(int)(Math.random()* names.length)];
    }

    public static String randomDogName(){
        String[]names={"Dogush","Dogidog","Dogaldo","Dogile","Doginiiho","Doginoin","Dogxer","Dogolon","Dogonihikio","Dogio"};
        return names[(int)(Math.random()* names.length)];
    }

    public static String randomGardenName(){
        String[]names={"Dog Kingdom","Dog Heaven"};
        return names[(int)(Math.random()* names.length)];
    }
}
