// Глазунов Юрий, ИВТ-25
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class arrays_unit {
    /// вычисление суммы a1 - a2 + a3 - ... + (-1)^(n+1) * an 
    /// бросает исключение IllegalArgumentException
    public static double summation_with_different_signs(double[] arr) throws IllegalArgumentException {

        if (arr == null) throw new IllegalArgumentException("Массив не должен быть null");

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                sum += arr[i];
            else 
                sum -= arr[i];
        }

        return sum;
    }


    /// заполняет массив arr случайными числами в диапазоне от min до max
    /// бросает исключение IllegalArgumentException
    public static void fill_array(double[] arr, double min, double max) throws IllegalArgumentException {
        if (arr == null) throw new IllegalArgumentException("Массив не должен быть null");
        if (min > max) throw new IllegalArgumentException("min не может быть больше max");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + Math.random() * (max - min);
        }
    }


    /// выводит массив arr по 10 элементов в строке
    public static void print_array(double[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }

        System.out.println();
        for (int i = 1; i <= arr.length; i++) {
            System.out.printf("%10.3f ", arr[i - 1]);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    } 


    /// записывает массив в файл
    /// бросает исключение IOException
    public static void array_to_file(double[] arr, String file_name) throws IOException {
        if (arr == null) throw new IllegalArgumentException("Массив не должен быть null");
        if (file_name == null) throw new IllegalArgumentException("Имя файла не должно быть null");

        try(PrintWriter out = new PrintWriter(new FileWriter(file_name))) {
            for(int i = 0; i < arr.length; i++) {
                out.printf("%.3f ", arr[i]);
            }
        }


    }
}


