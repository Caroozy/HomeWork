package hospital_system;

public class Nurse extends Person{
    private int roomNumber;

    public Nurse() {}


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "ID: "+super.getId()+", Name: Nurse"+super.getId()+" Age: "+super.getAge()+" Belongs to room nm."+roomNumber;
    }

}
