// Question: Write a Java program to create a user-defined matrix.
/* Observations: 
1. A user-defined matrix is a matrix that is created by the user, where the user can specify the number of rows and columns, as well as the values of the elements in the matrix.
Pseudo code: 
1. Import the Scanner class to read user input.
2. Create a class named User_Defined_Matrix.
3. In the main method, create a Scanner object to read user input.
4. Prompt the user to enter the number of rows and columns for the matrix.
5. Create a 2D array (matrix) with the specified number of rows and columns.
6. Use nested loops to iterate through the matrix and prompt the user to enter values for each element.
7. After the user has entered all the values, print the matrix to the console.

*/ 
public class User_Defined_Matrix {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The user-defined matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
