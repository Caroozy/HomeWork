package series5;

public abstract class Fish {
    private String name;
    private String color;
    int speed;
    private static int count=1;

    public Fish(){
        this.name="Nemo"+count;
        count++;
        this.color=ConstantFactory.color();
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Fish.count = count;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void makeSound(){
        System.out.println("Blup Blup Blup");
    }
    void draw(){
        System.out.println("  _\n" +
                "><_>\n");
    }
}
