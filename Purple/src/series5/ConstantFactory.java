package series5;

public class ConstantFactory {
    public static int rand(int min, int max){return (int)(Math.random()*(max-min))+min+1;}

    public static String color(){
        int rand=(int)(Math.random()*100)+1;
        if (rand<51){
            if (rand<31){
                if (rand<16){
                    return "Dark Blue";
                }
                return "Dark Gray";
            }
            return "Gray";
        }
        return "Yellow";
    }
}
