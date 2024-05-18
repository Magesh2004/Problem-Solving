import java.util.Scanner;
public class Automrpic_number {
    public static void main(String[] args) {
        //To find automorpic number
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = S.nextInt();
        if((n*n)%10==n){
            System.out.println("The number is Automorphic..");
        }
        else{
            System.out.println("The number is not Automorphic..");
          
        }
        S.close();

    }
}