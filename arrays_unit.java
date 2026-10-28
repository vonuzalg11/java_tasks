// Глазунов Юрий, ИВТ-25
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrays_unit {
    /// вычисление суммы a1 - a2 + a3 - ... + (-1)^(n+1) * an 
    /// бросает исключение IllegalArgumentException
    public static double summation_with_different_signs(double[] arr) {

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
    public static void fill_array(double[] arr, double min, double max) {
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


    /// записывает массив arr в текстовый файл file_name
    /// бросает исключение IOException
    public static void array_to_file(double[] arr, String file_name) throws IOException {
        if (arr == null) throw new IllegalArgumentException("Массив не должен быть null");
        if (file_name == null) throw new IllegalArgumentException("Имя файла не должно быть null");

        try(PrintWriter out = new PrintWriter(file_name)) {
            for(int i = 0; i < arr.length; i++) {
                out.printf("%.3f ", arr[i]);
            }
        }
    }


    /// читает массив из текстового файла file_name
    /// возвращает list типа List<Double> 
    /// бросает исключение IOException
    public static List<Double> list_from_file(String file_name) throws IOException {
        if (file_name == null) throw new IllegalArgumentException("Имя файла не должно быть null");

        List<Double> list = new ArrayList<>();    // List - более общий тип данных чем ArrayList (класс интерфейс)
        try (Scanner sc = new Scanner(new File(file_name))) {
            while (sc.hasNextDouble()) {
                list.add(sc.nextDouble());
            }
        }
        return list;
    }


    /// читает массив из текстового файла file_name
    /// возвращает массив arr
    /// бросает исключение IOException
    public static double[] array_from_file(String file_name) throws IOException {
        if (file_name == null) throw new IllegalArgumentException("Имя файла не должно быть null");

        // считаем количество чисел
        int count = 0;
        try (Scanner sc = new Scanner(new File(file_name))) {
            while (sc.hasNextDouble()) {
                sc.nextDouble();
                count++;
            }
        }
        
        double[] arr = new double[count];
        try (Scanner sc = new Scanner(new File(file_name))) {
            for (int i = 0; i < count; i++) {
                arr[i] = sc.nextDouble();
            }
        }
        return arr;
    }
}