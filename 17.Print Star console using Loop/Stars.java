public class Stars {
    public static void main(String[] args) {
        int row, numberofstarts;

        for (row = 1; row <= 10; row++) {
            for (numberofstarts = 1; numberofstarts <= row; numberofstarts++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
