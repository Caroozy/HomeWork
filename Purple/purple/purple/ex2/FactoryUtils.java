package purple.ex2;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class FactoryUtils {

    public static Date[] init(int year) {
        Date[] dates = new Date[365];
        Date start = new Date(1,1,year);
        for (int i = 0; i < dates.length; i++) {
            dates[i] = start;
            start = start.next();
        }
        return dates;
    }
}
