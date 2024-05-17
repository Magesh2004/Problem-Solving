public class Two_sum {
    public static void main(String[] args) {
        int[]a = {2,7,3,5,12};
        int b[] = new int[10];
        int k =0,val = 9;
        for (int i = 0; i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[i]+a[j]== val){
                    b[k++]=i;
                    b[k++]=j;
                }
            }
        }
        System.out.println("Array");
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Sum Array");
        for(int i =0;i<k;i++){
            System.out.println(b[i]);
        }
    }
}
