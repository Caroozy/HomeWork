package series5;

import java.util.Arrays;

public class Hotel {
    private Room[]reserved;
    private String hotelName;
    private int stars;
    public Hotel(Room[]rooms,String hotelName,int stars){
        this.hotelName=hotelName;
        this.stars=stars;
        if (stars>5||stars<1){
            stars=1;
        }
        this.reserved=rooms.clone();
    }
    public boolean hasGuest(Guest guest){
        for (int i=0;i<reserved.length;i++){
            if (reserved[i].hasGuest(guest)){
                return true;
            }
        }
        return false;
    }

    public boolean book(Guest guest, String roomName){
        for (int i=0;i< reserved.length;i++){
            if (guest.name==guest.getName()) {
                return false;
            }
            if (reserved[i].getRoomName()==roomName){
                reserved[i].addGuest(guest);
                return true;
            }
        }
        return false;
    }

    public Room[] getReserved() {
        return reserved;
    }

    public void setReserved(Room[] reserved) {
        this.reserved = reserved;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "reserved=" + Arrays.toString(reserved) +
                ", hotelName='" + hotelName + '\'' +
                ", stars=" + stars +
                '}';
    }
}
