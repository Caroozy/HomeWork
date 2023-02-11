package red.ex6;

import java.util.Arrays;

/**
 * Created by kobis on 10 Feb, 2022
 */
public class Policeman extends Player {

    private static final int MAX_NUM_CRIMINALS = 3;
    private Criminal[] arrestedCriminals = new Criminal[MAX_NUM_CRIMINALS];
    private int totalArrested;

    public Policeman(String name, int strength) {
        super(name, strength);
    }

    public boolean arrestedAll() {
        return !(totalArrested < MAX_NUM_CRIMINALS);
    }

    public boolean arrest(Criminal criminal) {

        if (this.isAlive() && criminal.isAlive()) {
            if (totalArrested < MAX_NUM_CRIMINALS) {
                if (this.strength > criminal.strength) {
                    this.strength = this.strength - criminal.knockOut();
                    arrestedCriminals[totalArrested++] = criminal;
                    return true;
                } else if (criminal.strength > this.strength) {
                    criminal.strength = criminal.strength - this.knockOut();
                } else {
                    criminal.knockOut();
                    this.knockOut();
                }
            }
        }

        return false;
    }


    public void showArrestedCriminals() {
        if (totalArrested > 0) {
            System.out.println("policeman : " + this.name + " arrested : " + totalArrested);
            for (int i = 0; i < arrestedCriminals.length; i++) {
                System.out.println(arrestedCriminals[i].name + "was arrested");
            }
        } else {
            System.out.println("policeman : " + this.name + "has not arrested anyone yet!!!");
        }
    }


    @Override
    public String toString() {
        return "Policeman{" +
                "arrestedCriminals=" + Arrays.toString(arrestedCriminals) +
                ", totalArrested=" + totalArrested +
                "} " + super.toString();
    }
}
