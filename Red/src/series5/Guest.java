package series5;

public class Guest {
    String name;
    String id;

    public Guest(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Guest(Guest guest){
        this.name=guest.name;
        this.id=guest.id;
    }
    public boolean equals(Guest other){
        if(other.id==id){
            return true;
        }
        return false;
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
