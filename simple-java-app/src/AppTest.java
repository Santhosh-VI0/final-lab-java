public class MatrixMultiplication {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        
        // Dimensions
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // 1. Check compatibility
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        // 2. Initialize result matrix
        int[][] result = new int[rowsA][colsB];

        // 3. Perform multiplication
        for (int i = 0; i < rowsA; i++) { // Loop through rows of A
            for (int j = 0; j < colsB; j++) { // Loop through columns of B
                for (int k = 0; k < colsA; k++) { // Perform dot product
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // 4. Output result
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
