public class Pyramid {
    public static void main(String[] args) {
        int n= 5;
        for(int i = 0;i<=n;i++){
            for(int j = i;j<n;j++){
                System.out.print(" ");
            }
            for(int K = i;K<=(2*i-1);K++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
