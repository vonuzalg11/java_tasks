// Глазунов Юрий, ИВТ-25
// Задача 136ж
// Даны натуральное число n, действительные числа a1,..., an. Вычислить: 
// a1 - a2 + a3 - ... + (-1)^(n+1) * an;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        double n = sc.nextDouble();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите a[%d]: ", i + 1);
            arr[i] = sc.nextDouble();
        }

        double res = arrays_unit.summation_with_different_signs(arr);

        System.out.printf("%f", res);
        sc.close();
    } 
}