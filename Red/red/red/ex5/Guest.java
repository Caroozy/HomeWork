package red.ex5;

/**
 * Created by kobis on 08 Feb, 2022
 */
public class Guest {

    private String name;
    private String id;

    public Guest(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Guest(Guest guest) {
        this.name = guest.name;
        this.id = guest.id;
    }

    public boolean equals(Guest other) {
        return this.id == other.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
