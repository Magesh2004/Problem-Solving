import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int x=n,r=0,a=0,d=0;
        while(x>0){
            x=x/10;
            d++;
        }
        x=n;
        while(x>0){
            a=x%10;
            r+=Math.pow(a, d);
            x=x/10;
        }
    
        if (r==n) {
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("It is not Armstrong");
        }
    }
}
