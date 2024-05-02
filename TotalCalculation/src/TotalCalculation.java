import java.io.*;
import java.util.*;

//I swear if this one somehow ends up not working too
public class TotalCalculation {
    public static void main(String[] args) {
        try {
            FileReader items = new FileReader("src/items.txt");
            FileWriter writing = new FileWriter("src/total.txt");
            Scanner reader = new Scanner(items);
            List<Double> itemPrices = new ArrayList<>();
            double runningTotal = 0;

            while (reader.hasNextDouble()) {
                double price = reader.nextDouble();
                itemPrices.add(price);
            }
            reader.close();

            for (int i = 0; i < itemPrices.size(); i++) {
                runningTotal += itemPrices.get(i);
            }
            double salesTax = runningTotal * 0.053;
            double fullTotal = salesTax + runningTotal;

            salesTax = Math.round(salesTax * 100);
            salesTax = salesTax / 100;
            fullTotal = Math.round(fullTotal * 100);
            fullTotal = fullTotal / 100;

            writing.write("The sub-total is: $" + runningTotal + "\n" +
                    "The sales tax is: $" + salesTax + "\n" +
                    "The final total is: $" + fullTotal);
            writing.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.fillInStackTrace();
        }
    }
}