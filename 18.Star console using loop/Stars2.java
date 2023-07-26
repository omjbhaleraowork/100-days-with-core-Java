public class Stars2 {
    public static void main(String[] args) {
        int row, numofstars;

        for (row = 1; row <= 10; row++) {
            for (numofstars = 1; numofstars <= row; numofstars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
