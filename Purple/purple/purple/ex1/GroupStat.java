package purple.ex1;

import java.util.Arrays;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class GroupStat {

    public static int numOfSmokers(Group group) {
        int count = 0;
        for (int i = 0; i < group.getPeople().length; i++) {
            if (group.getPeople()[i].isSmoking()) {
                count++;
            }
        }
        return count;
    }

    public static int numOfTelavivan(Group group) {
        return numOfLiving(group, "TLV");
    }

    public static int numOfLiving(Group group, String city) {
        int count = 0;
        for (int i = 0; i < group.getPeople().length; i++) {
            if (group.getPeople()[i].getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }


}
