import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check if it is odd or even:  ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("You have entered the even number");
        } else {
            System.out.println("You have entered the odd number");
        }
    }
}
