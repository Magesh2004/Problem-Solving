public class Sub_Product {
    public static void main(String[] args) {
        int n= 234;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int a =0,p=1,s=0;
        while (n>0){
            a= n % 10;
            s=s+a;
            p=p*a;
            n=n/10;
        }
        return (p-s);
    }
}
