import java.util.Arrays;

public class isogram {
    public static void main(String[] args) {
        String a = "pen";
        boolean f = true;
        char[] x = a.toLowerCase().toCharArray();
        Arrays.sort(x);
        for(int i = 0;i<x.length-1;i++){
            if(x[i]==x[i+1]){
                f=false;
                break;
            }
        }
        if (f) {  
            System.out.println(a + " is a isograms");  
        } else {  
            System.out.println(a + " is not a isograms");  
        } 
    }
}
