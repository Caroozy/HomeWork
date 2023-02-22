package purple.ex5;

/**
 * Created by kobis on 23 Dec, 2022
 */
public abstract class Fish {

    private static int count = 1;
    private String name;
    private String color;
    protected int speed;

    public Fish() {
        this.name = "Nemo "+ count++;
        this.color = ConstantFactory.color();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Fish.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void makeSound(){
        System.out.println("Blup, Blup, Blup");
    }

    public abstract void draw();
}
