// Глазунов Юрий, ИВТ-25
public class first_task_asserts {

    public static void main(String[] args) {
        assert first_unit.sum_digits(1) == 1: "n=1";
        assert first_unit.sum_digits(345) == 12: "n=345";
        assert first_unit.sum_digits(9876) == 30: "n=9876";
        assert first_unit.sum_digits(9) == 9: "n=9";
        assert first_unit.sum_digits(100) == 1: "n=100";

        System.out.println("Тесты пройдены");
    }
}