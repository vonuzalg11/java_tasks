public class Date {
    private byte day; 
    private byte month; 
    private short year;

    // конструктор (метод, инициализирующий объект)
    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    // конструктор
    public Date(byte day1, byte month1, short year1) {
        this();                 // day = 1, month = 1, year = 2000
        setYear(year1);
        setMonth(month1);
        setDay(day1);
    }

    // сеттер для дня
    // бросает исключение IllegalArgumentException
    public void setDay(byte day1) {
        if ((day1 < 1) || (day1 > daysInMonth(year, month)))
            throw new IllegalArgumentException("Данные некорректны");
        day = day1;
    }

    // сеттер для месяца
    // бросает исключение IllegalArgumentException
    public void setMonth(byte month1) {
        if ((month1 < 1) || (month1 > 12))
            throw new IllegalArgumentException("Данные некорректны");
        if (day > daysInMonth(year, month1))
            throw new IllegalArgumentException("Данные некорректны");
        month = month1;
    }

    // сеттер для года
    // бросает исключение IllegalArgumentException
    public void setYear(short year1) {
        if (day > daysInMonth(year1, month))
            throw new IllegalArgumentException("Данные некорректны");
        year = year1;
    }

    // геттер для дня
    public int getDay() {
        return day;
    }

    // геттер для месяца
    public int getMonth() {
        return month;
    }

    // геттер для года
    public int getYear() {
        return year;
    }

    // определяет сколько дней в месяце month года year
    private static byte daysInMonth(short year, byte month) {
        if (month == 2) {
            if (isLeapYear(year))
                return 29;
            else 
                return 28; 
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else
            return 31;
    }

    // опеределяет високосный год year или нет
    // Високосный год бывает каждые 4 года. Исключение: если год оканчивается на 00, 
    // то он не високосный (кроме случаев, когда он нацело делится на 400).
    private static boolean isLeapYear(short year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }

    // прибавляет days дней к дате
    // бросает исключение IllegalArgumentException
    public void plusDays(int days) {
        if (days < 0)
            throw new IllegalArgumentException("Данные некорректны");
        for (int i = 0; i < days; i++) {
            day++;
            if (day > daysInMonth(year, month)) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }
    }

    // отнимает days дней от даты
    // бросает исключение IllegalArgumentException
    public void minusDays(int days) {
        if (days < 0)
            throw new IllegalArgumentException("Данные некорректны");
        for (int i = 0; i < days; i++) {
            day--;
            if (day < 1) {
                month--;
                if (month < 1) {
                    month = 12;
                    year--;
                }
                day = daysInMonth(year, month);
            }
        }
    }
}