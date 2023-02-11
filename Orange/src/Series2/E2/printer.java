package Series2.E2;

public class printer {
    private long id;
    private String model;
    private String manufacturer;
    private Boolean isColorful;

    public printer() {
    }

    public printer(long id, String model, String manufacturer) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public printer(long id, String model, String manufacturer, Boolean isColorful) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.isColorful = isColorful;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getColorful() {
        return isColorful;
    }

    public void setColorful(Boolean colorful) {
        isColorful = colorful;
    }

    @Override
    public String toString() {
        return "printer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", isColorful=" + isColorful +
                '}';
    }
}
