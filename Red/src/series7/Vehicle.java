package series7;

public abstract class Vehicle {
    private final String manufacturer;

    private final String frameNumber;

    public Vehicle(String manufacturer, String frameNumber) {
        this.manufacturer = manufacturer;
        this.frameNumber = frameNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", frameNumber='" + frameNumber + '\'' +
                '}';
    }
}
