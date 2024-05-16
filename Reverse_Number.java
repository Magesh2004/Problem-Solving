public class Reverse_Number {
    public static void main(String[] args) {
        int n = 120;
        int x=n;
        int r=0,a =0;
        System.out.println("Number is "+n);
        while (x>0){
            a= x % 10;
            r = r*10+a;
            x=x/10;
        }
        System.out.println("Reversed Number is "+ r);
    }
}
