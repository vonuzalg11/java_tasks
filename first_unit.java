// Глазунов Юрий, ИВТ-25
public class first_unit {
    /// вычисление суммы цифр числа n
    public static int sum_digits(int n) {
        int sum = 0;
        int number = n;
        
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
}