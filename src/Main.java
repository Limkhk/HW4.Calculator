public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // a = 3
        int b = calc.minus.apply(1,1); // b = 0
        // В результате вычислений происходит деление на ноль. a=3 b=0  3 / 0, которое привело к ArithmeticException: / by zero
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}