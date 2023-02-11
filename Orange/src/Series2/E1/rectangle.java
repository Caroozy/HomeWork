package Series2.E1;

public class rectangle {
    private double a;
    private double b;
    private String color = "white";

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public rectangle() {
    }

    public rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public rectangle(double a, double b, String color) {
        this(a,b);
        this.color = color;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                '}';
    }
}
