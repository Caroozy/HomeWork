package series6;

public class Criminal extends Player {


    public Criminal(String name, int strength) {
        super(name, strength);
    }
    public Criminal(Criminal criminal){
        super(criminal.getName(), criminal.getStrength());
    }

    @Override
    public String toString() {
        return "Criminal{}"+super.toString();
    }
}
