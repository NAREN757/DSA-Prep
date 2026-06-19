public class spiralArray {

    public static void spiralArr(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        while(startRow <= endRow && startcol <= endcol) {
        //top part
        for(int j = startcol; j <= endcol; j++) {
            System.out.print(matrix[startRow][j] + " ");
        }

        //left part 
        for(int i = startRow + 1; i <= endRow; i++) {
            System.out.print(matrix[i][endcol]+" ");
        }
        //bottom part
        for(int j = endcol-1; j >= startcol;j--) {
            if(startRow == endRow) {
                break;
            }
            System.out.print(matrix[endRow][j] + " ");
        }
        //left part 
       for(int i = endRow-1; i >= startRow+1;i--){
        if(startcol == endcol) {
            break;
        }
        System.out.print(matrix[i][startcol] + " ");
       }
       
       startRow++;
       endRow--;
       startcol++;
       endcol--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

    spiralArr(matrix);
    }     
}