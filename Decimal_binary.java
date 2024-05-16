public class Decimal_binary {
    public static void main(String[] args) {
        int n = 21;
        System.out.println("Decimal is ");
        Binary(n);
    }
    public static void Binary(int n){
        int a[] = new int[40];
        int i = 0;
        while (n>0) {
            a[i++]=n%2;
            n = n/2;
        }
        for (int j = i-1;j>=0;j--)
            System.out.println(a[j]);
    }
}
