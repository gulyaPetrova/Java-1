import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        invertArray();
        filArray();
        doTask3();
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr0and1 = {0, 1, 1, 0, 1, 0, 1, 1}; // 8 elements
        for (int i = 0; i < arr0and1.length; i++) {
            if(arr0and1[i] == 0) {
                arr0and1[i] = 1;
                System.out.print(arr0and1[i] + ", ");
            } else if(arr0and1[i] == 1) {
                arr0and1[i] = 0;
                System.out.print(arr0and1[i] + ", ");
            }
        }
    }

    public static void filArray() {
        int[] eightNumbers = new int[8];
        for (int i = 0; i < eightNumbers.length; i++) {
            eightNumbers[i] = eightNumbers[i] + 3;
            System.out.println(eightNumbers[i]);

        }
    }

    public static void doTask3() {
        int[] differentNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < differentNumbers.length; i++) {
            if(differentNumbers[i] < 6) {
                differentNumbers[i] *= 2;
                System.out.print(differentNumbers[i] + " ");
            } else if(differentNumbers[i] >= 6) {
                differentNumbers[i] *= 1;
                System.out.print(differentNumbers[i] + " ");
            }
        }
    }

    public static void fillDiagonal() {
        int[][] squareTable = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j) {
                    squareTable[i][j] = 1;
                } else {
                    squareTable[i][j] = 0;
                }

                System.out.print(" " + squareTable[i][j] + " ");
            }
            System.out.println();

        }

    }


}
