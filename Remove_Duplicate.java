public class Remove_Duplicate {
    public static void main(String[] args) {
        int [] a = {1,2,4,6,3,2};
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
