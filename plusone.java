import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int [] arr = {1,1,9};
        System.out.println(Arrays.toString((sol(arr))));
    }
    static int[] sol(int[] digits)
    {
        int n = digits.length;
        for(int i= n-1;i>=0;i--)
        { 
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;    
        }
        int[] newNum = new int[n+1];
        newNum[0]=1;
        return newNum;
    }
}/* 
public class plusone {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] result = sol(arr);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    static int[] sol(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNum = new int[n + 1];
        newNum[0] = 1;
        return newNum;
    }
}*/
