import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row number: ");
        int row = input.nextInt();

        System.out.print("Enter the column number: ");
        int col = input.nextInt();
        System.out.println();

        int[][] matrix = new int[row][col];
        int[][] transposed = new int[col][row];

        // create matrix
        int k = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = k;
                k++;
            }
        }

        // show matrix
        System.out.println("Your matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // transpose of matrix
        int l = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = l;
                l++;
            }
        }

        // show the transposed matrix
        System.out.println("Your transposed matrix is: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%3d ", transposed[i][j]);
            }
            System.out.println();
        }
    }
}