package HW;

public class MuhendislikHesapMakineImpl extends AbstractCalculator implements MuhendislikHesapMakine {

    @Override
    public double exponentiation(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    @Override
    public double squareroot(double number) {
        return Math.sqrt(number);
    }

    @Override
    public void displayResult(double result) {

    }
}
