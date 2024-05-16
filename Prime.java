public class Prime {
    public static void main(String[] args) {
        int x = 10;
        for(int n =2;n<x;n++)
        {
            boolean f= true;
            for(int i =2;i<n;i++)
            {
               if(n%i==0)
               {
                f=false;
                break;
               } 
            }
            if (f) {
                System.out.println("It is prime : "+n);    
            }
        }
    }
}
