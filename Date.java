public class Date {
    private short day, month, year;

    // конструктор
    public Date(short day1, short month1, short year1) {
        day = day1;
        month = month1;
        year = year1;
    }

    public short getDay() {
        return day;
    }

    public short getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }
}