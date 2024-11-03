import java.util.Scanner;

public class IT24104170Lab3Q4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        
        if (number < 10000 || number > 99999) {
            System.out.println("The number is not a five-digit number.");
            scanner.close();
            return;
        }

        
        String numberStr = Integer.toString(number);


        for (int i = 0; i < numberStr.length(); i++) {
            
            System.out.print(numberStr.charAt(i));
            if (i < numberStr.length() - 1) {
                System.out.print(" ");
            }
        }

        
        scanner.close();
    }
}
