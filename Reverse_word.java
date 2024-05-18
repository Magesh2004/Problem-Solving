public class Reverse_word {
    public static void main(String[] args) {
        String s = "i like this program very much ";
        StringBuilder sb = new StringBuilder();
        String[] w = s.split(" +"); 
        for (int i=w.length-1;i>=0;i--){
            sb.append(w[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}