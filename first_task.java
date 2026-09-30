// Глазунов Юрий, ИВТ-25
// Дано натуральное число n (n ≤ 100). Чему равна сумма его цифр?
import java.util.Scanner;


public class first_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        
        int sum = first_unit.sum_digits(n);
        
        System.out.println(sum);
        sc.close();
    }

}