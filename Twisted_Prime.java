public class Twisted_Prime {
    public static void main(String[] args) {
        int n =  43;
            if(isprime(n)){
             int x = reversenum(n);
             if(isprime(x)){
                System.out.println("It is Twisted");
             }
             else{
                System.out.println("It is Not Twisted");
             }
            }
            else{
                System.out.println("It is Not Twisted");
            } 
        }
    
    
    public static int reversenum(int n){
        int a=0,r=0;
            while(n>0){
                a = n%10;
                r=r*10+a;
                n=n/10;
            }
            return r;
    }

    public static boolean isprime(int n){
        
        for(int i =2;i<n;i++)
           {
            if(n%i==0)
            {
            return false;
            } 
        }
        return true;
    }
}
