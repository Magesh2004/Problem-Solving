import java.util.Arrays;

public class Largest_perimeter {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--)
        {
            if(A[i] < (A[i-1] + A[i-2]))
                return A[i] + A[i-1] + A[i-2];
        }
        
        return 0;
    }
}


