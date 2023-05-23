import java.util.*;

class SwapNumbers {
    public static void main(String[] args) {

        int x, y, temp;
        System.out.println("Enter two numbers x and y:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping\nx = " + x + "\ny = " + y);
    }
}