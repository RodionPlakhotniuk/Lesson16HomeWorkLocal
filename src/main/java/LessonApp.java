import app.models.Calculator;

public class LessonApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(321,23));
        System.out.println(calculator.minus(2112,2110));
        System.out.println(calculator.multiplication(5,5));
        System.out.println(calculator.division(100,10));
    }
}
