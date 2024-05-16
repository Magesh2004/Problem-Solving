public class Second_largest {
    public static void main(String[] args) {
        int [] arr = {1,2,8,5};
        int l = 0,sl = 0;
        for(int i : arr)
        {
            if(i > l)
            {
                sl = l;
                l = i;
            }
            else if(i>sl && i!= l)
            {
                sl = i;
            }
        }
        System.out.println("Second largest is "+sl);
    }
}
