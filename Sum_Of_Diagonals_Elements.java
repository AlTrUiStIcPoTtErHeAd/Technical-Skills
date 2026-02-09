// Wap to find the sum of diagonal elements of a matrix.
/* Observations: 
1. The diagonal elements of a matrix are the elements that lie on the line that runs from the top-left corner to the bottom-right corner of the matrix.
2. To find the sum of the diagonal elements, we can iterate through the matrix and add the elements that are on the diagonal (where the row index is equal to the column index).
Pseudo code:
1. Import the Scanner class to read user input.
2. Create a class named Sum_Of_Diagonals_Elements.
3. In the main method, create a Scanner object to read user input.
4. Prompt the user to enter the number of rows and columns for the matrix.
5. Create a 2D array (matrix) with the specified number of rows and columns.
6. Use nested loops to iterate through the matrix and prompt the user to enter values for each element.
7. Initialize a variable to store the sum of the diagonal elements.
8. Use a loop to iterate through the matrix and add the diagonal elements (where row index equals column index) to the sum variable.
9. After the loop, print the sum of the diagonal elements to the console.

 */
public class Sum_Of_Diagonals_Elements {
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
        
        int sumOfDiagonals = 0;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            sumOfDiagonals += matrix[i][i];
        }
        
        System.out.println("The sum of the diagonal elements is: " + sumOfDiagonals);
    }
}
