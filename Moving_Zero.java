public class Moving_Zero {
    public static void main(String[] args) {
        int[] a ={0,1,0,4,12}; 
        a=zero(a);       
        for(int i:a){
            System.out.println(i);
        }
    }
     public static int[] zero(int[]a) {
        int j=0;
        int[] b = new int[a.length];    
        for (int i=0;i<a.length-1;i++){
            if(a[i]==0){
                b[j++]=a[i];
            }
        }
        for (int i=0;i<a.length-1;i++){
            if(a[i]!=0){
                b[j++]=a[i];
            }
        }

        return b;
    }
}
