
public class CurrencyConverter {

    public static double dollarToReal(double amount, double dollarPrice) {
        return (dollarPrice*amount) + (dollarPrice*amount) * 0.06;
    }

}
