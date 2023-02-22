package series1;

public enum Name {
    MOSHE,
    DAVID,
    JACK,
    TAL,
    DANIEL;

    Name() {
    }
    public static String getRandomName(){
        int random=(int)(Math.random()*Name.values().length);
        return Name.values()[random].name().toLowerCase();
    }
}
