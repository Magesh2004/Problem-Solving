public class Fibonacci_series {
    public static void main(String[] args) {
        int n =6;
        int a=0,b=1,c=0;
        for(int i =0;i<n;i++){
            c=a+b;
            a = b;
            b = c;
            System.out.println(a);
        }
    }
}
