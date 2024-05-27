public class Finding_missing_num {
    public static void main(String[] args) {
        int[] a ={1,2,3,5,0,4,6,7};
        int sum = (a.length*(a.length+1))/2;
        System.out.println("Array...");
        for(int i:a){
            System.out.println(i);
        }
        for (int i =0;i<a.length;i++){
            sum-=a[i];
        }
        System.out.println("Missing number is"+sum);
    }
}
