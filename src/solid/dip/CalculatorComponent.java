package solid.dip;

public class CalculatorComponent {
    private ICalculator calculator;

    public CalculatorComponent(ICalculator calculator) {
        this.calculator = calculator;
    }

    public void printAdd(int num1, int num2) {
        System.out.println(calculator.add(num1,num2));
    }
}
