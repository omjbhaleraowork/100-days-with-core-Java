import java.util.Scanner;

/**
 * CompareStrings
 */
public class CompareStrings {

    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter first string ");
        s1 = sc.nextLine();

        System.out.println("eneter second string ");
        s2 = sc.nextLine();

        if (s1.compareToIgnoreCase(s2) < 0)
            System.out.println("First string is greater than second");
        else if (s1.compareToIgnoreCase(s2) > 0)
            System.out.println("first string is smaller than second");
        else
            System.out.println("both strings are equal");
    }
}