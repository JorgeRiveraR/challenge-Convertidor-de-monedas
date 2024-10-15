import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de monedas!");
        System.out.print("Ingrese la cantidad a convertir: ");
        double amount = scanner.nextDouble();

        System.out.print("Ingrese la moneda de origen (e.g. USD, EUR, etc.): ");
        String fromCode = scanner.next();

        System.out.print("Ingrese la moneda de destino (e.g. USD, EUR, etc.): ");
        String toCode = scanner.next();

        // Obtener las monedas correspondientes
        Currency from = getCurrency(fromCode);
        Currency to = getCurrency(toCode);

        // Realizar la conversión
        double result = converter.convert(amount, from, to);

        System.out.printf("La cantidad de %f %s es igual a %f %s%n", amount, fromCode, result, toCode);
    }

    private static Currency getCurrency(String code) {
        // Obtener la moneda correspondiente de la lista de monedas
        // ...
        return null;
    }
}