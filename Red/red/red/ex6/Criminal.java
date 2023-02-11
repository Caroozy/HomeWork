package red.ex6;

/**
 * Created by kobis on 10 Feb, 2022
 */
public class Criminal extends Player{

    public Criminal(String name, int strength) {
        super(name, strength);
    }

    public Criminal(Criminal other){
        super(other.name,other.strength);
    }

    @Override
    public String toString() {
        return "Criminal{} " + super.toString();
    }
}