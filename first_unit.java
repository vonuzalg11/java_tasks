// Глазунов Юрий, ИВТ-25
public class first_unit {
    /// вычисление суммы цифр числа number
    /// бросает исключение IllegalArgumentException
    public static int sum_digits(int number) throws IllegalArgumentException {

        if (number < 0) throw new IllegalArgumentException("Число не должно быть отрицательным");   

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
}