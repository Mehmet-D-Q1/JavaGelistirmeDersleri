package HW;

import java.text.NumberFormat;
import java.util.Locale;

public class UKStyleCalculator extends MuhendislikHesapMakineImpl {

    @Override
    public void displayResult(double result) {
        Locale locale = new Locale("en", "UK");
        NumberFormat decimalFormatter = NumberFormat.getInstance(locale);
        String formatUk = decimalFormatter.format(result);
        System.out.println("UK: " + formatUk);

    }
}
