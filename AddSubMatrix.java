// Write a java program to add and subtract 2 matrices.

import java.util.Scanner;

public class AddSubMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] sub = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();
        }
        System.out.println("The first matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix1[i][j] + " ");
            System.out.println();
        }
        System.out.println("The second matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix2[i][j] + " ");
            System.out.println();
        }
        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
        System.out.println("The difference of the two matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(sub[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}