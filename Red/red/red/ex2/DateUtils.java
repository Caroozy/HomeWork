package red.ex2;

import java.time.Year;

/**
 * Created by kobis on 03 Feb, 2022
 */
public class DateUtils {

    public static int getMaxDays(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        if (Year.isLeap(year)) {
            return 29;
        }
        return 28;
    }

}
