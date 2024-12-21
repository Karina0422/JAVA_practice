import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number to factorize: ");
        int number = scanner.nextInt();
        
        System.out.print("Prime factors of numbers " + number + ": ");
        primeFactorization(number);
        
        scanner.close();
    }

    public static void primeFactorization(int number) {
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 2) {
            System.out.print(number);
        }
    }
}
