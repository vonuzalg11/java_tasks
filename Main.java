public class Main {
    public static void main(String[] args) {
        Date date = new Date((byte)23, (byte)11, (short)2009);

        date.setYear((short) 2024);
        date.setMonth((byte) 2);
        date.setDay((byte) 29);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());

        date.plusDays(1);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());

        date.minusDays(100);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());
    }
}