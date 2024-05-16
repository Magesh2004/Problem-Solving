public class Palindrome {
    public static void main(String[] args) {
        int n =121;
        int x= n,r=0,a=0;
        while(x>0){
            a=x%10;
            r=r*10+a;
            x = x/10;
        }
        if (r==n) {
            System.out.println("It is panlindrome");
        }
        else{
            System.out.println("It is not panlindrome");
        }
    }
}