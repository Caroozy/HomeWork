package series1;

public class Secretary extends  Employee {

    private String office;

    public Secretary(String name, double salary, String office) {
        super(name, salary);
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString()+" Type: Secretary{" +
                "office='" + office + '\'' +
                '}';
    }
}
