package HW;

public class MuhendislikHesapMakineImpl implements MuhendislikHesapMakine{

    @Override
    public double exponentiation(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    @Override
    public double squareroot(double number) {
        return Math.sqrt(number);
    }
}
