import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrixA, matrixB, n);
        printMatrix(result, n);
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB, int n) {
        int[][] product = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
