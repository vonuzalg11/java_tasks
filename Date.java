public class Date {
    private int day, month, year;

    // конструктор (метод, инициализирующий объект)
    // бросает исключение IllegalArgumentException
    public Date(int day1, int month1, int year1) {
        if ((month1 < 1) || (month1 > 12))
            throw new IllegalArgumentException("Данные некорректны");
        if ((day1 < 1) || (day1 > daysInMonth(year1, month1)))
            throw new IllegalArgumentException("Данные некорректны");
        day = day1;
        month = month1;
        year = year1;
    }

    // конструктор (метод, инициализирующий объект)
    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    // сеттер для дня
    // бросает исключение IllegalArgumentException
    public void setDay(int day1) {
        if ((day1 < 1) || (day1 > daysInMonth(year, month)))
            throw new IllegalArgumentException("Данные некорректны");
        day = day1;
    }

    // сеттер для месяца
    // бросает исключение IllegalArgumentException
    public void setMonth(int month1) {
        if ((month1 < 1) || (month1 > 12))
            throw new IllegalArgumentException("Данные некорректны");
        if (day > daysInMonth(year, month1))
            throw new IllegalArgumentException("Данные некорректны");
        month = month1;
    }

    // сеттер для года
    // бросает исключение IllegalArgumentException
    public void setYear(int year1) {
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
    private static int daysInMonth(int year, int month) {
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
    // 
    private static boolean isLeapYear(int year) {
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