import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer");

        while ((n = sc.nextInt()) != 0) {
            System.out.println("You Entered " + n);
            System.out.println("input an integer");

        }
        System.out.println("Out of loop");
    }
}
