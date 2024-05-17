public class Spiral_matrix {
    public static void main(String[] args) {
        int n = 6,val = 1;
        int a[][] = new int[n][n];
        int top = 0,bottom = n-1,left = 0,right = n-1;
        while (val<=n*n) {
            for(int i =left;i<=right;i++){
                a[top][i]=val;
                val++;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                a[i][right]=val;
                val++;
            }
            right--;
            for(int i = right;i>=left;i--){
                a[bottom][i]=val;
                val++;
            }
            bottom--;
            for(int i =bottom;i>=top;i--){
                a[i][left]=val;
                val++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}