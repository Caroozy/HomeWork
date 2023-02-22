package purple.ex2;

import java.util.Arrays;

/**
 * Created by kobis on 15 Feb, 2022
 */
public class FullYear {
    private Date[] dates;

    public FullYear(int year) {
        this.dates =  FactoryUtils.init(year);
    }

    public Date[] getDates() {
        return dates;
    }

    public void setDates(Date[] dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "FullYear{" +
                "dates=" + Arrays.toString(dates) +
                '}';
    }
}
