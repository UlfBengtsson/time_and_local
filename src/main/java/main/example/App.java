package main.example;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class App
{
    public static void main( String[] args )
    {
        /*
        LocalDateTime now = LocalDateTime.now();

        //System.out.println( now );

        System.out.println( now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) );



        System.out.println(Locale.getDefault().toLanguageTag());

        Locale loc = Locale.US;

        Locale.setDefault(loc);

        System.out.println( now );

        System.out.println( now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) );

        */


        double sum = 2380.50;

        System.out.println(sum);

        NumberFormat deCurrForm = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat svCurrForm = NumberFormat.getCurrencyInstance(Locale.getDefault());

        System.out.println(deCurrForm.format(sum));
        System.out.println(svCurrForm.format(sum));


        ResourceBundle rb = ResourceBundle.getBundle("lang");
        ResourceBundle rbUK = ResourceBundle.getBundle("lang", Locale.UK);
        ResourceBundle rbUS = ResourceBundle.getBundle("lang", Locale.US);
        ResourceBundle rbJA = ResourceBundle.getBundle("lang", Locale.JAPANESE);// only language
        Locale.setDefault(Locale.CHINA);// default
        ResourceBundle rbDefault = ResourceBundle.getBundle("lang", Locale.FRENCH);

        System.out.println(rb.getString("sum"));
        System.out.println(rbUK.getString("sum"));
        System.out.println(rbUS.getString("sum"));
        System.out.println(rbJA.getString("sum"));
        System.out.println(rbDefault.getString("sum"));// default
    }
}
