// Глазунов Юрий, ИВТ-25
// Задача 136ж
// Даны натуральное число n, действительные числа a1,..., an. Вычислить: 
// a1 - a2 + a3 - ... + (-1)^(n+1) * an;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // не обязательно использовать try-with-resources для Scanner
        try (Scanner sc = new Scanner(System.in)) { 
 
            System.out.print("Введите n: ");
            int n = 0;
            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода");
                return;
            }

            if (n < 0) {
                System.out.println("n не должно быть отрицательным");
                return;
            }

            double[] arr = new double[n]; 
            try {
            arrays_unit.fill_array(arr, 0, 100);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка передачи значений");
                return;
            }

            arrays_unit.print_array(arr);

            // String file = "array_file.txt";
            // try {
            //     arr = arrays_unit.array_from_file(file);
            // } catch (IOException e) {
            //     System.out.println("Ошибка при работе с файлом");
            //     return;
            // }

            // String out_file = "out_array_file.txt";
            // try {
            //     arrays_unit.array_to_file(arr, out_file);
            // } catch (IOException e) {
            //     System.out.println("Ошибка при работе с файлом");
            //     return;
            // }

            double res = arrays_unit.summation_with_different_signs(arr);

            System.out.printf("\nОтвет: %.3f", res);

        }
    }
}