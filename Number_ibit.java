public class Number_ibit {
    public static void main(String[] args) {
        int n=1;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int bit=0,mask=1;
        for(int i = 0;i<32;i++){
            if((mask&n)!=0){
                bit++;
            }
            mask<<=1;
        }
        return bit;
    }
}
