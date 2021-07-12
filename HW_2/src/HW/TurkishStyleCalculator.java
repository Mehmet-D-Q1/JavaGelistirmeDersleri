package HW;

import java.text.NumberFormat;
import java.util.Locale;

public class TurkishStyleCalculator extends MuhendislikHesapMakineImpl{

    @Override
    public void displayResult(double result) {
        Locale locale = new Locale("tr", "TR");
        NumberFormat decimalFormatter = NumberFormat.getInstance(locale);
        String formatTr = decimalFormatter.format(result);
        System.out.println("TR: " + formatTr);

    }

}
