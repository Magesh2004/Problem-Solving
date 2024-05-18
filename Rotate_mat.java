public class Rotate_mat {
    public static void main(String[] args) {
        
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] x = new int[3][3];
        for (int i =0;i<3;i++){
            for (int j =0;j<3;j++){
                    x[j][i]=a[i][j];
                
            }
        }

        for (int i =0;i<3;i++){
        int l = 0, r= 2;
        while(l<r){
            int temp = a[i][l];
            a[i][l]=a[i][r];
            a[i][r] = temp;
            l++;
            r--;
        }
        }
        System.out.println("Mat3ix...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix After Rotation...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}

