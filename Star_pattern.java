public class Star_pattern {
    public static void main(String[] args) {
        int n =10;
        System.out.println("The x pattern");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==j || n+1==i+j){
                    System.out.print("X");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
