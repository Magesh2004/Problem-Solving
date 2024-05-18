import java.util.ArrayList;
import java.util.List;

public class Spriral_inorder {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("ArrayList : " + spiralOrder(a).toString()); 
    }
    public static List<Integer> spiralOrder(int[][] a) {
        int top = 0,bottom = a.length-1,left = 0,right = a[0].length-1;
        List<Integer> x = new ArrayList<Integer>();
        
        while (top<=bottom && left<=right) {
            for(int i =left;i<=right;i++){
                x.add(a[top][i]);
            }
            top++;
            for(int i =top;i<=bottom;i++){
                x.add(a[i][right]);
            }
            right--;
            if (top <= bottom) {
                for(int i = right;i>=left;i--){
                    x.add(a[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for(int i =bottom;i>=top;i--){
                    x.add(a[i][left]);
                }
                left++;
            }
        }
        return x;
    }
}
