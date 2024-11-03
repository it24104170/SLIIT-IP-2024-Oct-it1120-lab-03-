import java.util.Scanner;

public class  IT24104170Lab3Q1B{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

    
        double totalAmount = pricePerKg * kilograms;

        
        double discount = 0.10 * totalAmount;

    
        double finalAmount = totalAmount - discount;

        
        System.out.printf("Total amount before discount: %.2f\n", totalAmount);
        System.out.printf("Discount amount (10%%): %.2f\n", discount);
        System.out.printf("The total amount you have to pay after discount is: %.2f\n", finalAmount);

        
        scanner.close();
    }
}
