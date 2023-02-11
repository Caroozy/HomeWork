package red.ex5;

import java.util.Arrays;

/**
 * Created by kobis on 08 Feb, 2022
 */
public class Room {

    private Guest[] guests;
    private int maxGuests;
    private int numOfGuests;
    private String name;
    private double pricePerNight;

    public Room(int maxGuests, String name, double pricePerNight) {
        setMaxGuests(maxGuests);
        this.guests = new Guest[this.maxGuests];
        this.name = name;
        setPricePerNight(pricePerNight);
    }

    public Room(Room other) {
        this.maxGuests = other.maxGuests;
        this.pricePerNight = other.pricePerNight;
        this.name = other.name;
        this.numOfGuests = other.numOfGuests;
        this.guests = new Guest[other.numOfGuests];
    }

    public Guest[] getGuests() {
        return guests;
    }

    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        if (maxGuests < 0) {
            System.out.println("Invalid max guest number...");
            maxGuests = 4;
        } else {
            this.maxGuests = maxGuests;
        }
    }



    public String getName() {
        return name;
    }


    public void setPricePerNight(double pricePerNight) {
        if (pricePerNight < 0) {
            System.out.println("Invalid price per night...");
            pricePerNight = 100;
        } else {
            this.pricePerNight = pricePerNight;
        }

    }


    private boolean isFull() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                return false;
            }
        }

        return true;
    }


    public boolean isEmpty() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean addGuest(Guest guest) {

        if (isFull()) {
            return false;
        }
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                guests[i] = guest;
                return true;
            }
        }

        return false;

    }

    public boolean hasGuest(Guest guest){

        for (int i = 0; i < guests.length; i++) {

            if(guests[i]!=null && guests[i].equals(guest)){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "guests=" + Arrays.toString(guests) +
                ", maxGuests=" + maxGuests +
                ", numOfGuests=" + numOfGuests +
                ", name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
