import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "Keep";
        String str2 = "peek";
        String a = str1.replaceAll("//s","");
        String b = str2.replaceAll("//s","");
        boolean f = false;
        if(a.length() != b.length()){
            f = false;
        }
        else{
            char[] x = a.toLowerCase().toCharArray();
            char[] y = b.toLowerCase().toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);
            f = Arrays.equals(x, y);

        }
        if (f) {  
            System.out.println(a + " and " + b + " are anagrams");  
        } else {  
            System.out.println(a + " and " + b + " are not anagrams");  
        }  
    }
}
