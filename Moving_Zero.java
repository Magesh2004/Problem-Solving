public class Moving_Zero {
    public static void main(String[] args) {
        int[] a ={0,1,0,4,12}; 
        int j=0;
        for (int i=0;i<a.length;i++){
            if(a[i]!=0 && a[j]==0){
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        
            if(a[j]!=0){
                j++;
            }  
        }     
        for(int i:a){
            System.out.println(i);
        }
    }
}
