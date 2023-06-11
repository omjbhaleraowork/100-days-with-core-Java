
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.println("Enter an Interger to calculte its factorial");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number Should not be negative");

        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is = " + fact);
        }
        sc.close();
    }
}
