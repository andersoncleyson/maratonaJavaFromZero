package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
