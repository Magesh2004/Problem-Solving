public class Merge_array {
    public static void main(String[] args) {
        int [] a ={1,3,5,6};
        int [] b ={2,3,4,7};
        int [] c = new int[a.length+b.length];
        int k=0;
        Duplicate d = new Duplicate();
        for(int i =0;i<a.length;i++){
            c[k] = a[i];
            k++;
        }
        for(int i =0;i<b.length;i++){
            c[k] = b[i];
            k++;
        }
        for(int i =0;i<c.length;i++){
            System.out.println(c[i]);
        }
        System.out.println("After removing duplicate");
        d.remove(c);
    }
}
class Duplicate{
    void remove(int[] a){
        int [] c = new int[a.length];
        int k = 0;
        boolean f = true;
        for (int i=0;i<a.length;i++) {
            f = true;
            for(int j=0;j<a.length;j++){
                if(a[i]==c[j]){
                    f=false;
                    break;
                }            
            }
            if(f){
                c[k++]=a[i];
            }  
        }

        for(int i =0;i<k;i++){
            System.out.println(c[i]);
        }
    }
}
