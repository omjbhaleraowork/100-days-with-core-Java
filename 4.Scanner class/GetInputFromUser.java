import java.util.Scanner;

import javafx.beans.binding.FloatBinding;

class GetInputFromUser {
    public static void main(String args[]) {

        int a;
        Float b;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        s = sc.nextLine();
        System.out.println("You entered string " + s);

        System.out.println("Enter an integer");
        a = sc.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter a float");
        b = sc.nextFloat();
        System.out.println("You entered float " + b);
        sc.close();
    }
}