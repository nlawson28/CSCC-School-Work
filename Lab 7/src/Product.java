import java.util.Scanner;

//Nathan Lawson - Lab 7 Java program (Product and Cost Average)

public class Product {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String productName;
        double total = 0, average, productCost;
        int count = 0;

        System.out.println("Products that cost $100.00 or more");
        System.out.println("Enter the product ordered - type 'stop' to end: ");
        productName = input.nextLine();

        //While loop will check the sentinel value AND ensure that case does not matter
        while (!productName.equalsIgnoreCase("stop")) {
            System.out.println("Enter the cost of the product ordered: ");
            productCost = input.nextDouble();
            input.nextLine();
            if (productCost >= 100) {
                count = count + 1;
                total = total + productCost;
            }
            System.out.println("Enter the product ordered - type 'stop' to end: ");
            productName = input.nextLine();
        }

        System.out.println("There were " + count + " item(s) that had a cost of $100.00 or more");
        average = total / count;

        //This equation below allows for the amount to be round to the nearest 2 decimals places to avoid run on amounts
        average = Math.round(average*100.0)/100.0;

        System.out.println("The average price of items with a cost of $100.00 or more is $" + average);
        System.out.println("End of report");
    }
}
