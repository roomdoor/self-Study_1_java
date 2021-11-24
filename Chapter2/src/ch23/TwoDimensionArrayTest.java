package ch23;

public class TwoDimensionArrayTest {
    public static void main(String[] args) {

        int[][] TwoDimension = {{1, 2, 3}, {4, 5, 6, 7}};

        for (int i = 0; i < TwoDimension.length; i++) {

            for (int j = 0; j < TwoDimension[i].length; j++) {
                System.out.print(TwoDimension[i][j] + ", ");
            }
            System.out.println();
        }


    }
}
