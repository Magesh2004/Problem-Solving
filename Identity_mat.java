public class Identity_mat {
    public static void main(String[] args) {
        int r = 3, c= 3;
        boolean f = true;
        int[][] a = {{1,0,0},{0,1,0},{0,0,1}};
        for (int i =0;i<r;i++){
            for (int j =0;j<c;j++){
                if (i==j) {
                    if(a[i][j] == 1){
                        f = true;
                    }
                    else{
                        f = false;  
                    }
                }
                else{
                    if(a[i][j] == 0){
                        f = true;
                    }
                    else{
                        f=false;
                    }
                }
            }
        }
        if(f){
            System.out.println("It is identity matrix");
        }
        else{
            System.out.println("It is not an identity matrix");
        }
    }
}
