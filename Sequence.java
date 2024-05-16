import java.util.Arrays;

public class Sequence {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 5, 4, 7, 10};
        for(int i =0;i<a.length;i++){
            if(a[i]%2==1){
                a[i]=a[i]*-1;
            }
        }
        Arrays.sort(a);

        for(int i =0;i<a.length;i++){
            if(a[i]%2==-1){
                a[i]=a[i]*-1;
            }
        }
        
        for(int i =0;i<a.length;i++) {
            System.out.print( a[i]+ " ");
        }
    }
}
