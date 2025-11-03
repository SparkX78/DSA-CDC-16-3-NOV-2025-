import java.util.*;
public class DSA_77 {
    public static void setMatrixZeros(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        HashSet<Integer> zero_row = new HashSet<>();
        HashSet<Integer> zero_col = new HashSet<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col ; j++){
                if(matrix[i][j] == 0){
                    zero_row.add(i);
                    zero_col.add(j);
                }
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j< col; j++){
                if(zero_row.contains(i)||zero_col.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        } 
    }
    public static void main(String[] args){
        int[][] matrix = { {1, 0, 1},
                            {1, 1, 1},
                            {1, 1, 1}};

        setMatrixZeros(matrix);

        System.out.println("THE MATRIX ELEMENTS AFTER SET 0");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
