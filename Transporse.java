public class Transporse {
    public static void main(String[] args) {
        int r = 3, c= 3;
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] x = new int[r][c];
        for (int i =0;i<r;i++){
            for (int j =0;j<c;j++){
                    x[j][i]=a[i][j];
                
            }
        }
        System.out.println("Matrix...");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix After transporse...");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
