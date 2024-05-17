public class GCD {
    public static void main(String[] args) {
        int a = 36,b =60;
        ;System.out.println(gcd(a,b));

    }
    static int gcd(int a,int b){
        int min = 0,max = 0,f =0;
        if (a>b) {
            min = b;
        }
        else{
            min = a;
        }
        
        for(int i = 1;i<=min;i++){
            if(a%i==0 && b%i==0){
                f=i;
            }
            if (f>max) {
                max = f;
            }
        }
        return max;
    }
}
