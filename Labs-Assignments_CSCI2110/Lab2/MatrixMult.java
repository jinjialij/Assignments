//Multiplication of two square matrices of size n X n each
import java.util.Scanner;
public class MatrixMult {
    /** Main method */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        double num;
        System.out.print("Enter the size of each matrix: ");
        n = keyboard.nextInt();
        System.out.print("Enter the matrix element\t");
        System.out.print("All elements of the matrices are assumed to be the same: ");
        num = keyboard.nextDouble();
        double[][] matrix1 = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix1[i][j] = num;
        double[][] matrix2 = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix2[i][j] = num;

        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();
        double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " millisecs");

    }

    /** The method for multiplying two matrices */
    public static double[][] multiplyMatrix(double[][] m1, double[][] m2)
    {
        double [][] result=new double[m1.length][m1.length];
        for(int rRow=0;rRow<m1.length;rRow++)//goes ove all rows
        {
            for(int rCol=0;rCol<m1[rRow].length;rCol++)//goes over each colum of each row
            {
                for(int i=0;i<m2.length;i++)//i should be the length of rows of m2
                {
                    //m1 stick to the row of result and m2 stick to the col of result
                    result[rRow][rCol]+=m1[rRow][i]*m2[i][rCol];
                }
            }
        }
        return result;
    }
}


