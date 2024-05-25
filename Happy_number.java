import java.util.HashSet;
import java.util.Set;

public class Happy_number {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(Happy(n));
    }
    public static boolean Happy(int n) {
        Set<Integer> used  = new HashSet<>();
        while(n!=1 && !used.contains(n)){
            used.add(n);
            n=getSquare(n);
        }
        return n==1;
    }
    public static int getSquare(int n){
        int r =0;
        while(n>0){
            int a=n%10;
            r+=a*a;
            n=n/10;
        }
        return r;
    }

}
