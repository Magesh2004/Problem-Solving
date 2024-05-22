public class Count_odd {
    public static void main(String[] args) {
        int low=3,high=15;
        System.out.println(countOdds(low, high));
    }
    public static int countOdds(int low, int high) {
        int count=0;
        if(low%2==0) {
            for(int i=low+1; i<high+1; i+=2) {
                count++;
            }
        }
        else {
            for(int i=low; i<high+1; i+=2) {
                count++;
            }
        }
        return count;
    }
}
