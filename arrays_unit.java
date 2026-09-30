// Глазунов Юрий, ИВТ-25
public class arrays_unit {
    /// вычисление суммы a1 - a2 + a3 - ... + (-1)^(n+1) * an 
    public static double summation_with_different_signs(double[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                sum += arr[i];
            else 
                sum -= arr[i];
        }

        return sum;
    }
}