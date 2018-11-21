import java.util.Scanner;

// Nathan Lawson - Lab 6 - Product and shipping costs

public class Product {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int shippingType;
        double shippingCost, productCost, totalCost;

        System.out.println("Shipping Costs");
        System.out.println("Enter the cost of the product ordered: ");

        productCost = input.nextDouble();

        System.out.println("Standard shipping (enter '1') for $7.95");
        System.out.println("Express shipping (enter '2') for $13.95");
        System.out.println("Priority shipping (enter '3') for $23.95");
        System.out.println("Enter your choice (1,2, or 3): ");
        shippingType = input.nextInt();

        while(true){
            if(shippingType == 1){
                shippingCost = 7.95;
                break;
            } else if (shippingType == 2) {
                shippingCost = 13.95;
                break;
            } else if (shippingType == 3) {
                shippingCost = 23.95;
                break;
            } else {
                System.out.println("Not a valid shipping choice. Please try again.");
                System.out.println("Enter your choice (1,2, or 3): ");
                shippingType = input.nextInt();
            }
        }

        totalCost = shippingCost + productCost;

        System.out.println("The cost of the product is " + productCost + " plus shipping of " + shippingCost + " equals " + totalCost);

    }

}
