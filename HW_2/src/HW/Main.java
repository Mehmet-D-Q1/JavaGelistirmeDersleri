package HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BasitHesapMakineimpl basitHesapMakineimpl = new BasitHesapMakineimpl();
        MuhendislikHesapMakineImpl muhendislikHesapMakine = new MuhendislikHesapMakineImpl();
        TurkishStyleCalculator turkishStyleCalculator = new TurkishStyleCalculator();
        UKStyleCalculator ukStyleCalculator = new UKStyleCalculator();

        char operator;
        double number1 ;
        double number2 ;
        double result = 0;
        double number = 0;
        int choiseCalc ;

        while (true){
        try {

        Scanner input = new Scanner(System.in);
        System.out.println("\nBasit Hesap Makinesi için : 1'i \nMühendislik Hesap Makinesi için: 2'yi giriniz... ");
        choiseCalc = input.nextInt();

        if(choiseCalc == 1) {
            System.out.println("Lütfen yapmak istediğiniz işlem için ilgili karakterlerden birini giriniz: " + "\nToplama: + \nÇıkarma: - \nÇarpma: * \nBölme: / ");
            operator = input.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Toplama işlemini seçtiniz: '+' ");
                    System.out.println("Lütfen 1. sayıyı giriniz: ");
                    number1 = input.nextDouble();
                    System.out.println("Lütfen 2. sayıyı giriniz: ");
                    number2 = input.nextDouble();
                    result = basitHesapMakineimpl.addition(number1, number2);
                    break;
                case '-':
                    System.out.println("Çıkarma işlemini seçtiniz: '-' ");
                    System.out.println("Lütfen 1. sayıyı giriniz: ");
                    number1 = input.nextDouble();
                    System.out.println("Lütfen 2. sayıyı giriniz: ");
                    number2 = input.nextDouble();
                    result = basitHesapMakineimpl.subtraction(number1, number2);
                    break;
                case '*':
                    System.out.println("Çarpma işlemini seçtiniz: '*' ");
                    System.out.println("Lütfen 1. sayıyı giriniz: ");
                    number1 = input.nextDouble();
                    System.out.println("Lütfen 2. sayıyı giriniz: ");
                    number2 = input.nextDouble();
                    result = basitHesapMakineimpl.multiplication(number1, number2);
                    break;
                case '/':
                    System.out.println("Bölme işlemini seçtiniz: '/' ");
                    System.out.println("Lütfen 1. sayıyı giriniz: ");
                    number1 = input.nextDouble();
                    System.out.println("Lütfen 2. sayıyı giriniz: ");
                    number2 = input.nextDouble();
                    if (number2 == 0)
                    {
                        System.out.println("Lütfen sıfırdan farklı bir sayı giriniz...");
                        continue;
                    }
                    else
                    {
                        result = basitHesapMakineimpl.division(number1, number2);
                    }
                    break;
                default:
                    System.out.println("Geçersiz işlem girdiniz...");
                    continue;

            }
            System.out.println("Yaptığınız işlemin sonucu: ");
            turkishStyleCalculator.displayResult(result);
            ukStyleCalculator.displayResult(result);

        }
            else if(choiseCalc == 2) {
                System.out.println("Lütfen yapmak istediğiniz işlem için ilgili karakterlerden birini giriniz: " + "\nToplama: + \nÇıkarma: - \nÇarpma: * \nBölme: / \nÜst Alma: e \nKarekök Alma: s ");
                operator = input.next().charAt(0);

                switch (operator) {
                    case '+':
                        System.out.println("Toplama işlemini seçtiniz: '+' ");
                        System.out.println("Lütfen 1. sayıyı giriniz: ");
                        number1 = input.nextDouble();
                        System.out.println("Lütfen 2. sayıyı giriniz: ");
                        number2 = input.nextDouble();
                        result = basitHesapMakineimpl.addition(number1, number2);
                        break;
                    case '-':
                        System.out.println("Çıkarma işlemini seçtiniz: '-' ");
                        System.out.println("Lütfen 1. sayıyı giriniz: ");
                        number1 = input.nextDouble();
                        System.out.println("Lütfen 2. sayıyı giriniz: ");
                        number2 = input.nextDouble();
                        result = basitHesapMakineimpl.subtraction(number1, number2);
                        break;
                    case '*':
                        System.out.println("Çarpma işlemini seçtiniz: '*' ");
                        System.out.println("Lütfen 1. sayıyı giriniz: ");
                        number1 = input.nextDouble();
                        System.out.println("Lütfen 2. sayıyı giriniz: ");
                        number2 = input.nextDouble();
                        result = basitHesapMakineimpl.multiplication(number1, number2);
                        break;
                    case '/':
                        System.out.println("Bölme işlemini seçtiniz: '/' ");
                        System.out.println("Lütfen 1. sayıyı giriniz: ");
                        number1 = input.nextDouble();
                        System.out.println("Lütfen 2. sayıyı giriniz: ");
                        number2 = input.nextDouble();
                        if (number2 == 0)
                        {
                            System.out.println("Lütfen sıfırdan farklı bir sayı giriniz...");
                            continue;
                        }
                        else
                        {
                            result = basitHesapMakineimpl.division(number1, number2);
                        }
                        break;

                    case 'e':
                        System.out.println("Üst Alma işlemini seçtiniz: 'e' ");
                        System.out.println("Lütfen 1. sayıyı giriniz: ");
                        number1 = input.nextDouble();
                        System.out.println("Lütfen 2. sayıyı giriniz: ");
                        number2 = input.nextDouble();
                        result = muhendislikHesapMakine.exponentiation(number1, number2);
                        break;
                    case 's':
                        System.out.println("Karekök Alma işlemini seçtiniz: 's' ");
                        System.out.println("Lütfen bir sayı giriniz: ");
                        number = input.nextDouble();
                        if (number < 0)
                        {
                            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz...");
                            continue;
                        }
                        else
                        {
                            result = muhendislikHesapMakine.squareroot(number);
                        }
                        break;

                    default:
                        System.out.println("Geçersiz işlem girdiniz...");
                        continue;
                }
            System.out.println("Yaptığınız işlemin sonucu: ");
            turkishStyleCalculator.displayResult(result);
            ukStyleCalculator.displayResult(result);

            }
            else
            {
                System.out.println("Geçersiz bir seçim yaptınız...");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Karakter Hatası...Lütfen sayı giriniz...");
        }

        continue;
    }


    }
}
