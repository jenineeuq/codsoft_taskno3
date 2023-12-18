import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Step 1: Allow the user to choose base and target currencies
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base currency code: ");
        String baseCurrency = scanner.nextLine().toUpperCase();
        
        System.out.print("Enter the target currency code: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Step 2: Fetch real-time exchange rates from a reliable API
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        // Step 3: Take input from the user for the amount they want to convert
        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        // Step 4: Convert the input amount using the fetched exchange rate
        double convertedAmount = amountToConvert * exchangeRate;

        // Step 5: Display the result
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }

    // Placeholder method for fetching real-time exchange rates from an API
    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        // Replace this with actual API call to get exchange rate
        // For simplicity, let's assume a fixed exchange rate of 1.2 for demonstration
        return 1.2;
    }
}
