import java.util.Scanner;

public class IT24104170Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKg = scanner.nextDouble();
        
        
        double totalAmount = pricePerKg * numberOfKg;
        
        
        System.out.println("The total amount you have to pay is: " + totalAmount);
        
        scanner.close();
    }
}
