public class Resize_Array {
    public static void main(String[] args) {
        int[] a ={0,1,0,4,12};
        int Capacity = 8;
        a= resize(a,Capacity);
        System.out.println("Array has been resized");  
    }
    public static int[] resize(int[] a,int Capacity){
        int[] temp = new int[Capacity];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        return temp;
    }
}
