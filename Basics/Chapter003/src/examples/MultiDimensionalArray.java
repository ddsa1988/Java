package examples;

public class MultiDimensionalArray {
    public static void userMain() {
        {
            int[][] twoD = new int[4][5];
            int k = 0;

            for (int i = 0; i < twoD.length; i++) {
                for (int j = 0; j < twoD[i].length; j++) {
                    twoD[i][j] = k;
                    k++;

                    System.out.print(twoD[i][j] + " ");
                }
                System.out.println();
            }
        }

        System.out.println();

        {
            int[][] twoD = new int[4][];
            int k = 0;

            twoD[0] = new int[1];
            twoD[1] = new int[2];
            twoD[2] = new int[3];
            twoD[3] = new int[4];

            for (int i = 0; i < twoD.length; i++) {
                for (int j = 0; j < twoD[i].length; j++) {
                    twoD[i][j] = k;
                    k++;

                    System.out.print(twoD[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
