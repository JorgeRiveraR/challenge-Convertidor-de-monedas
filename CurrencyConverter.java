public class CurrencyConverter {
    public double convert(double amount, Currency from, Currency to) {
        // Utiliza las tasas de cambio para hacer la conversión
        double rateFrom = from.getRate();
        double rateTo = to.getRate();
        return amount * (rateTo / rateFrom);
    }
}