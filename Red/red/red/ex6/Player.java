package red.ex6;

/**
 * Created by kobis on 10 Feb, 2022
 */
public abstract class Player {

    protected String name;
    protected int strength;

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }

    protected boolean isAlive() {
        return (this.strength > 0);
    }

    protected int knockOut() {
        int originPower = this.strength;
        this.strength = 0;
        return originPower;
    }
}
