package solid.dip;

public class ClientCalculation {
    public static void main(String[] args) {
        CalculatorComponent calculatorComponent=new CalculatorComponent(new CasioCalculator());
        calculatorComponent.printAdd(10,20);
    }
}
