package Series2.E3;

public class light {
    private int totalHours;
    private String color="white";
    private double cost=19.99;

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public light(int totalHours, double cost) {
        this.totalHours = totalHours;
        this.cost = cost;
    }

    public light(int totalHours, String color) {
        this.totalHours = totalHours;
        this.color = color;
    }

    public light(int totalHours, String color, double cost) {
        this.totalHours = totalHours;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "light{" +
                "totalHours=" + totalHours +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
