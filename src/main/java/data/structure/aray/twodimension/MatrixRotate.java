package data.structure.aray.twodimension;
import java.util.Arrays;

public class MatrixRotate {

    public static void main(String[] args) {

        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] outmatrix ={{7,4,1},{8,5,2},{9,6,3}};
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrixOut = rotateMartix(matrix);
        System.out.println(Arrays.deepToString(matrixOut));

        System.out.println(Arrays.deepToString(outmatrix));
    }

    private static int[][] rotateMartix(int[][] matrix) {
// Swap matrix to change rows to column
        for(int i=0;i<matrix.length;i++) {
            for(int j=i;j< matrix.length;j++) {
               int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        //swap columns
        for(int i=0;i<matrix.length;i++){
            int low = 0;
            int high = matrix.length-1;

            while(low < high)
            {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;

                low++;
                high--;
            }
        }
        return matrix;
    }
}
