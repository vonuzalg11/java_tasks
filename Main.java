public class Main {
    public static void main(String[] args) {
        Date date = new Date(23, 11, 2009); // 

        date.setDay(29);
        date.setMonth(2);
        date.setYear(2024);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());

        date.plusDays(1);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());

        date.minusDays(100);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());
    }
}