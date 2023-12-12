import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define file paths
        String inputFilePath = "items.txt";
        String outputFilePath = "total.txt";

        // Open the "items.txt" file for reading
        try (Scanner scanner = new Scanner(new File(inputFilePath))) {
            double total = 0;

            // Read all values in a loop
            while (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
            }

            // Calculate sub-total, tax, and final total
            double taxRate = 0.053;
            double subTotal = total;
            double salesTax = subTotal * taxRate;
            double finalTotal = subTotal + salesTax;

            // Write results to "total.txt"
            try (FileWriter writer = new FileWriter(outputFilePath)) {
                writer.write(String.format("Sub-Total: %.2f\n", subTotal));
                writer.write(String.format("Sales Tax (5.3%%): %.2f\n", salesTax));
                writer.write(String.format("Final Total: %.2f\n", finalTotal));

                System.out.println("Calculation completed. Results written to total.txt");
            } catch (IOException e) {
                System.err.println("Error writing to total.txt");
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.err.println("Error reading from items.txt");
            e.printStackTrace();
        }
    }
}