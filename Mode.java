public class Mode {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,3,5,5};
        int i,j,count=0,max=0,maxValue=0;
        //Finding the count of each element
        for(i =0;i<a.length;i++){
            for(j =0;j<a.length;j++){
                if(a[i]==a[j])
                count++;
            }
            //Finding the maximum number of time a element occuren
            if (count>max) {
                max= count;
                maxValue=a[i];
            }
        }
        System.out.println("Mode of the array is :" + maxValue);
    }
}
