package exerciciosOrientacaoObjetos.entities;

public class CurrencyConverter {
    public double dollarPrice;
    public double amount;
    public static final double IOF = 0.06;

    public double convertToReal(double dollars) {
        double convert = dollars * amount;
        double totalWithTax = convert + (amount * IOF);
        return totalWithTax;
    }
}
