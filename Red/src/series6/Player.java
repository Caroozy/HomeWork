package series6;

public class Player {
    private String name;
    private int Strength;

    public Player(String name, int strength) {
        this.name = name;
        Strength = strength;
    }
    protected boolean isAlive(){
        if (getStrength()>0){
            return true;
        }
        return false;
    }
    protected int knockOut(){
        int tmp=getStrength();
        setStrength(0);
        return tmp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Strength=" + Strength +
                '}';
    }
}
