// Глазунов Юрий, ИВТ-25
// Дано натуральное число n (n ≤ 100). Чему равна сумма его цифр?
import java.util.InputMismatchException;
import java.util.Scanner;


public class first_task {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int n = 0;
            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода");
                return;
            }

            int sum = 0;
            try {
                sum = first_unit.sum_digits(n);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка ввода");
                return;
            }

            System.out.println(sum);
        }
    }

}