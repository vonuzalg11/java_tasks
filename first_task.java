// Глазунов Юрий, ИВТ-25
// Дано натуральное число n (n ≤ 100). Чему равна сумма его цифр?

public class first_task {
    public static void help() {
        System.out.println("first_task <number>");
        System.out.println();
        System.out.println("Аргументы:");
        System.out.println("    number - целочисленное значение");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Ошибка: указан не 1 аргумент");
            help();
            return;
        }

        int number = 0;

        try {
            number = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.err.println("Ошибка: неверное число");
            help();
            return;
        }

        try {
            int sum = first_unit.sum_digits(number);
            System.out.println(sum);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }
    }

}