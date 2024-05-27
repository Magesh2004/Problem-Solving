public class String_palindrom {
    public static void main(String[] args) {
        String s = "Malayalam";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s){
        char[] str = s.toLowerCase().toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
           if(str[i]!=str[j]){
                return false;
           } 
           j--;
           i++;
        }
        return true;
    }
}
