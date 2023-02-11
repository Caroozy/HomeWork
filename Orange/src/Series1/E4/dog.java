package Series1.E4;

public class dog {
    private String name;
    private float weight;
    private String color="black";
    private boolean isVaccinated=true;

    public dog() {
    }

    public dog(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public dog(String name, float weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public dog(String name, float weight, String color, boolean isVaccinated) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
