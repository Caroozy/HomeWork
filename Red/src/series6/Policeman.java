package series6;

import java.util.Arrays;

public class Policeman extends Player{
    private Criminal[]arrestedCriminals;
    private int totalArrests;
    private int MAX_NUM_CRIMINALS;

    public Policeman(String name, int strength) {
        super(name, strength);
    }
    public boolean arrestedAll(){
        if (MAX_NUM_CRIMINALS==totalArrests){
            return true;
        }
        return false;
    }

    public boolean arrest(Criminal criminal){
        if (criminal.isAlive()&&isAlive()){
            if (totalArrests!=MAX_NUM_CRIMINALS){
                int power;
                if (getStrength()>criminal.getStrength()){
                    setStrength(getStrength()-criminal.knockOut());
                    return true;
                }else if(getStrength()==criminal.getStrength()){
                    criminal.knockOut();
                    knockOut();
                }else {
                    criminal.setStrength(criminal.getStrength()-knockOut());
                }
            }
        }
        return false;
    }
    public void showArrestedCriminals(){
        if (arrestedCriminals[0]==null){
            System.out.println("officer: "+getName()+" has got no arrests");
            return;
        }
        System.out.println("officer: "+getName());
        for (int i=0;i<arrestedCriminals.length;i++){
            System.out.println((i+1)+": "+arrestedCriminals[i].getName());
        }
    }

    public Criminal[] getArrestedCriminals() {
        return arrestedCriminals;
    }

    public void setArrestedCriminals(Criminal[] arrestedCriminals) {
        this.arrestedCriminals = arrestedCriminals;
    }

    public int getTotalArrests() {
        return totalArrests;
    }

    public void setTotalArrests(int totalArrests) {
        this.totalArrests = totalArrests;
    }

    public int getMAX_NUM_CRIMINALS() {
        return MAX_NUM_CRIMINALS;
    }

    public void setMAX_NUM_CRIMINALS(int MAX_NUM_CRIMINALS) {
        this.MAX_NUM_CRIMINALS = MAX_NUM_CRIMINALS;
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "arrestedCriminals=" + Arrays.toString(arrestedCriminals) +
                ", totalArrests=" + totalArrests +
                ", MAX_NUM_CRIMINALS=" + MAX_NUM_CRIMINALS +
                '}';
    }
}
