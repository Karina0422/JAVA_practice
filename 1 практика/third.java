import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original price of the product: ");
        double originalPrice = scanner.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discountPercentage = scanner.nextDouble();
        
        double discountAmount = (discountPercentage / 100) * originalPrice;
        double newPrice = originalPrice - discountAmount;
        
        System.out.printf("New product price with discount: %.2f\n", newPrice);
        
        scanner.close();
    }
}
