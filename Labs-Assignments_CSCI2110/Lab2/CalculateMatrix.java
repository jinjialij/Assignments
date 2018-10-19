import java.util.Scanner;
public class CalculateMatrix {
    /** Main method */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        double num;
        System.out.print("Enter the size of each matrix: ");
        n = keyboard.nextInt();
        System.out.println("Enter the matrix element");
        /*System.out.print("Enter all elements of the matrices: ");
        num = keyboard.nextDouble();*/
        double[][] matrix1 = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element ["+i+"]["+j+"] of the matrices: ");
                num = keyboard.nextDouble();
                matrix1[i][j] = num;
            }
            System.out.print("\n");
        }
        double[][] matrix2 = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element ["+i+"]["+j+"] of the matrices: ");
                num = keyboard.nextDouble();
                matrix2[i][j] = num;
            }
            System.out.print("\n");
        }
        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();
        double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " millisecs");

        for (int row = 0; row < matrix1.length; row++)
        {
            for (int col = 0; col < matrix1[row].length; col++)
            {
                System.out.println(resultMatrix[row][col]);
            }
        }
    }

    /** The method for multiplying two matrices */
    public static double[][] multiplyMatrix(double[][] m1, double[][] m2)
    {
        double [][] result=new double[m1.length][m1.length];
        for(int rRow=0;rRow<m1.length;rRow++)
        {
            for(int rCol=0;rCol<m1[rRow].length;rCol++)
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
