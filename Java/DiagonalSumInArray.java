import java.util.*;

class firstclass {
    public static int diagonalSum(int matrix[][]) {

        int sum = 0;

        for(int i = 0; i < matrix.length; i += 1) {
            for(int j = 0; j < matrix[0].length; j += 1) {

                // primary diagonal
                if(i == j) {
                    sum += matrix[i][j];
                }
                // secondary diagonal
                else if(i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1 , 2 , 3 , 4},
                          {5 , 6 , 7 , 8},
                          {9 , 10 , 11 , 12},
                          {13 , 14 , 15 , 16}};

        System.out.print(diagonalSum(matrix));
    }
}
