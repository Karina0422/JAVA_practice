public class first {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double c = 4.5;
        String str = "Hello, World!";
        boolean isTrue = true;

        int sum = a + b; 
        int difference = a - b; 
        double product = a * c; 
        double quotient = a / (double)b; 
        int remainder = a % b; 

        boolean andOperation = (a > b) && (c < 5); 
        boolean orOperation = (a < b) || (c > 4); 
        boolean notOperation = !isTrue; 

        System.out.println("Arithmetic operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder of division: " + remainder);

        System.out.println("\nLogical operations:");
        System.out.println("Logical AND (a > b && c < 5): " + andOperation);
        System.out.println("Logical OR (a < b || c > 4): " + orOperation);
        System.out.println("Logical NOT (!isTrue): " + notOperation);

        System.out.println("\nString: " + str);
    }
}
