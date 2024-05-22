public class Avg_array {
    public static void main(String[] args) {
        int[] n ={4000,3000,1000,2000};
        System.out.println(average(n));
    }
    public static double average(int[] salary) {
        double sum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int sal : salary) {
            if (sal < min) {
                min = sal;
            }
            if (sal > max) {
                max = sal;
            }
            sum += sal;
        }
        sum-=max+min;
        return sum/(salary.length-2);
    
    }
}
