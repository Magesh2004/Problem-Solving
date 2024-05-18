public class Matrix_add {
    public static void main(String[] args) {
        int r = 3, c= 3;
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{2,3,5},{7,8,9},{2,1,3}};
        int[][] x = new int[r][c];
        
        for (int i =0;i<r;i++){
            for (int j =0;j<c;j++){
                    x[i][j]=a[i][j]+b[i][j];
                
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
