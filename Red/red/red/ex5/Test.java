package red.ex5;

/**
 * Created by kobis on 08 Feb, 2022
 */
public class Test {

    public static void main(String[] args) {
        // Room 1
        Guest g1 = new Guest("Oz","123");
        Guest g2 = new Guest("Daniel","234");

        // Room 2
        Guest g3 = new Guest("Ilan","345");
        Guest g4 = new Guest("Yaniv","456");
        Room r1 = new Room(4,"Royal Room",150.00);
        r1.addGuest(g1);
        r1.addGuest(g2);
        Room r2 = new Room(4,"Nice Room",125.50);
        r2.addGuest(g3);
        r2.addGuest(g4);
        Room r3 = new Room(4,"Cute Room",75.00);
        Room[] rooms = {r1,r2,r3};

        Hotel h1 = new Hotel(rooms,"Kobs Hotel",7);

        System.out.println("Does Oz is the hotel?");
        System.out.println(h1.hasGuest(g1)); // true
        System.out.println("Does Ilan is the hotel?");
        System.out.println(h1.hasGuest(g2)); // true

        Guest g5 = new Guest("Moshe","789");
        System.out.println(h1.book(g5,"not existing room")); // False

        System.out.println(h1.book(g5,"Nice Room")); // True







    }
}
