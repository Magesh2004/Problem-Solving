import java.util.Arrays;

public class Arithmetic_sequence {
    public static void main(String[] args) {
        int[] a = {3,5,1};
        System.out.println(canMakeArithmeticProgression(a)); 
    }
    public static boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int x = a[1]-a[0];
        for(int i=2;i<n;i++){
            if (a[i]-a[i-1]!=x) {
                return false;
            }
        }
        return true;
    }
}
