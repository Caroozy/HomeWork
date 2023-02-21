package series5;

public class Whale extends Fish{
    int lengthInMeters;

    public Whale(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
        this.speed=90;
    }

    public int getLengthInMeters() {
        return lengthInMeters;
    }

    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "lengthInMeters=" + lengthInMeters +
                ", speed=" + speed +
                '}';
    }
    public void makeSound(){
        System.out.println("WHOM WHOM WHOM");
    }
    public void draw(){
        System.out.println("__v_\n" +
                "(____\\/{");
    }
}
