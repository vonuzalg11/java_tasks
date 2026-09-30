// Глазунов Юрий, ИВТ-25
public class arrays_asserts {
    public static void main(String[] args) {
        assert Math.abs(arrays_unit.summation_with_different_signs(new double[]{}) - 0.0) < 1e-9: "пустой массив";
        assert Math.abs(arrays_unit.summation_with_different_signs(new double[]{7.5}) - 7.5) < 1e-9: "один элемент";
        assert Math.abs(arrays_unit.summation_with_different_signs(new double[]{1, 2, 3, 4}) - (-2.0)) < 1e-9: "{1,2,3,4}";

        System.out.println("Тесты пройдены");
    }
}