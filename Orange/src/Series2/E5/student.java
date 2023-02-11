package Series2.E5;

public class student {
    private int id;
    private String lastName;
    private String firstName;
    private float average;
    private String teacher;

    public student() {
    }

    public student(int id, String lastName, String firstName, float average, String teacher) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.average = average;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", average=" + average +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
