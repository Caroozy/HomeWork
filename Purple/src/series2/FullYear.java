package series2;

import java.time.LocalDate;
import java.util.Arrays;

public class FullYear {
    private Date[]dates;
    public FullYear(int year){
        if ((year%4==0&&year%100!=0)||year%400==0){
            this.dates=new Date[366];
        }else {
            this.dates=new Date[365];
        }
        int month =1;
        for(int i=0;i< this.dates.length;){
            int id=1;
            while (id<=getDaysInMonth(month,year)){
                dates[i]=new Date(id,month,year);
                id++;
                i++;
            }
            month++;
        }

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

    public int getDaysInMonth(int month, int year){
        int day=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=30;
                break;
            case 2:
                if ((year%4==0&&year%100!=0)||(year%400==0)){
                    day=29;
                    break;
                }
                day=28;
                break;
        }
        return day;
    }
}
