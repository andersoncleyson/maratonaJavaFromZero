package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeBrazil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália " +df1.format(calendar.getTime()));
        System.out.println("Suíça " +df2.format(calendar.getTime()));
        System.out.println("India " +df3.format(calendar.getTime()));
        System.out.println("Japan " +df4.format(calendar.getTime()));
        System.out.println("Brazil " +df5.format(calendar.getTime()));
        System.out.println("Holanda " +df6.format(calendar.getTime()));

        System.out.println(localeBrazil.getDisplayCountry(localeJapan));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeHolanda.getDisplayCountry());
    }
}
