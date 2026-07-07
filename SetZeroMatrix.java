import java.util.ArrayList;

public class SetZeroMatrix {
    
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        //Make rows zero
        for(int i =0; i<m; i++){
            if(zeroRow[i]){
                for(int j=0; j<n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        //Make columns zero
        for(int j =0; j<n; j++){
            if(zeroCol[j]){
                for(int i=0; i<m; i++){
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}
