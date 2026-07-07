public class SpiralMatrix {
    
    public static void spiralOrder(int[][] matrix){

        int colBegin = 0, rowBegin = 0, rowEnd = matrix.length-1, colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){

            //Move right
            for(int i = colBegin; i<=colEnd; i++){
                System.out.println(matrix[rowBegin][i]);
            }

            rowBegin++; //! row covered

            for(int i = rowBegin; i<=rowEnd; i++){
                System.out.println(matrix[i][colEnd]);
            }

            colEnd--;//1 col covered

            if(rowBegin <= rowEnd){
                for(int i = colEnd; i>=colBegin; i--){
                    System.out.println(matrix[rowEnd][i]);
                }
            }

            rowEnd--;

            if( colBegin <= colEnd){
                for(int i = rowEnd; i>=rowBegin; i--){
                    System.out.println(matrix[i][colBegin]);
                }
            }

            colBegin++;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}
