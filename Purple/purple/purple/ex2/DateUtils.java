package purple.ex2;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class DateUtils {


    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int maxDaysInMonth(int month, int year) {
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
            case 2:
                return (isLeap(year)) ? 29 : 28;
        }
        return -1;
    }

    public static String getMonth(int month) {

        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "Spetember";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";

        }

        return "";
    }

}
