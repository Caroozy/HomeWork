package series5;

public class Shark extends Fish {
    int numOfTeeth;
    public Shark(int numOfTeeth){
        this.numOfTeeth=numOfTeeth;
        this.speed=120;
    }

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String toString() {
        return "Shark{" +
                "numOfTeeth=" + numOfTeeth +
                ", speed=" + speed +
                '}';
    }
    public void makeSound(){
        System.out.println("Yummy Yummy Yummy");
    }
    public void draw(){
        System.out.println("      .            \n" +
                "\\_____)\\_____\n" +
                "/--v____ __`<         \n" +
                "        )/           \n" +
                "        '");
    }
}
