package hospital_system;

import java.util.Arrays;

public class Hospital {
    private String name;

    private Room[]rooms=new Room[10];

    public Hospital() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
