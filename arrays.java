// Глазунов Юрий, ИВТ-25
// Задача 136ж
// Даны натуральное число n, действительные числа a1,..., an. Вычислить: 
// a1 - a2 + a3 - ... + (-1)^(n+1) * an;
import java.io.IOException;

public class arrays {
    public static void main() { 
        double[] arr; 

        String file = "array_file.txt";
        try {
            arr = arrays_unit.array_from_file(file);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");
            return;
        }

        String out_file = "out_array_file.txt";
        try {
            arrays_unit.array_to_file(arr, out_file);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом");
            return;
        }

        double res = arrays_unit.summation_with_different_signs(arr);

        System.out.printf("\nОтвет: %.3f", res);

    }
}