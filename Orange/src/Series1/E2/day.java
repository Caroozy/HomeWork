package Series1.E2;

import java.time.LocalDate;

public class day {
    private int day;
    private int month;
    private int year;

    public day(){
        day=LocalDate.now().getDayOfMonth();
        month=LocalDate.now().getMonthValue();
        year=LocalDate.now().getYear();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "day{" +
                "day:" + day +
                ", month:" + month +
                ", year:" + year +
                '}';
    }
}
