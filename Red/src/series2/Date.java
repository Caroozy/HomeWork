package series2;

import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;


    public void checkMonth(int month) {
        Scanner scanner = new Scanner(System.in);
        if (month > 12 || month < 0) {
            System.out.println("Month invalid");
            month = scanner.nextInt();
        } else {
            System.out.println("month valid");
        }
    }

    public void checkDay(int day, int month, int year) {
        Scanner scanner = new Scanner(System.in);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                while (day > 31) {
                    System.out.println("day invalid");
                    day = scanner.nextInt();
                }
                break;
            case 2:
                while (day > 28) {
                    if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (day == 29)) {
                        break;
                    }
                    System.out.println("day invalid");
                    day = scanner.nextInt();
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                while (day > 30) {
                    System.out.println("day invalid");
                    day = scanner.nextInt();
                }
                break;
        }
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
