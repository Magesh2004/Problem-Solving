public class Greatest_sum {
    public static void main(String[] args) {
        int r = 3, c= 3;
        int max = 0,sum = 0,n =0;
        int[][] a = {{1,0,0},{0,1,1},{0,0,1}};
        for (int i =0;i<r;i++){
            sum = 0;
            for (int j =0;j<c;j++){
                sum = sum +a[i][j];
            }
            if(sum>max){
                max = sum;
                n=i;
            }
        }
        System.out.println("Greatest sum "+ max+" row : "+n);
    }
}
