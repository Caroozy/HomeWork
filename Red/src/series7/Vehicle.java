package series7;

public class Vehicle {
    private String manufacturer;
    private String frameNumber;

    public Vehicle(String manufacturer, String frameNumber) {
        this.manufacturer = manufacturer;
        this.frameNumber = frameNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
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
