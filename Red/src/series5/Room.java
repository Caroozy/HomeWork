package series5;

public class Room {
    private Guest[]guests;
    private int maxAtRoom;
    private int atRoom= guests.length;
    private String roomName;
    private double pricePerNight;

    public Room(int maxAtRoom, String roomName, double pricePerNight) {
        setMaxAtRoom(maxAtRoom);
        this.guests=new Guest[maxAtRoom];
        this.roomName = roomName;
        setPricePerNight(pricePerNight);
    }
    public Room(Room room){
        this.maxAtRoom=room.maxAtRoom;
        this.guests=new Guest[maxAtRoom];
        this.atRoom=room.atRoom;
        this.roomName=room.roomName;
        this.pricePerNight=room.pricePerNight;
    }
    private boolean isFull(){
        for (int i=0;i<guests.length;i++){
            if (guests[i]==null){
                return false;
            }
        }
        return true;
    }
    private boolean isEmpty(){
        for (int i=0;i<guests.length;i++){
            if (guests[i]!=null){
                return false;
            }
        }
        return true;
    }

    public boolean addGuest(Guest guest){
        if (!isFull()){
            for (int i=0;i<guests.length;i++){
                if (guests[i]==null){
                    guests[i]=guest;
                    break;
                }
            }
            return true;
        }
        return false;
    }
    public boolean hasGuest(Guest guest){
        if (!isEmpty()){
            for (int i=0;i<guests.length;i++){
                if (guests[i]==guest){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Guest[] getGuests() {
        return guests;
    }

    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }

    public int getMaxAtRoom() {
        return maxAtRoom;
    }

    public void setMaxAtRoom(int maxAtRoom) {
        this.maxAtRoom = maxAtRoom;
    }

    public int getAtRoom() {
        return atRoom;
    }

    public void setAtRoom(int atRoom) {
        this.atRoom = atRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{" +
                "maxAtRoom=" + maxAtRoom +
                ", roomName='" + roomName + '\'' +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
