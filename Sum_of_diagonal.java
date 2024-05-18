public class Sum_of_diagonal {
    public static void main(String[] args) {
        int r = 3, c= 3,sum =0;
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{2,3,5},{7,8,9},{2,1,3}};        
        for (int i =0;i<r;i++){
            for (int j =0;j<c;j++){
                if (i==j) {
                    sum = sum +a[i][j]+b[i][j];
                }
                
            }
        }
        System.out.println("Sum of diagonal : "+sum);
        
    }
}
