public class Spriral_Pattern {
    public static void main(String[] args) {
        int n = 6,val = n;
        int a[][] = new int[n][n];
        int top = 0,bottom = n-1,left = 0,right = n-1;
        while (val>=0) {
            for(int i =left;i<=right;i++){
                a[top][i]=val;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                a[i][right]=val;
            }
            right--;
            for(int i = right;i>=left;i--){
                a[bottom][i]=val;
            }
            bottom--;
            for(int i =bottom;i>=top;i--){
                a[i][left]=val;
            }
            left++;
            val--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
