public class Count_of_Char {

    public static void main(String[] args) {
        String a = "alpha";
        int count = 0;
        char c = 'a';
        char[] x = a.toLowerCase().toCharArray();
        for(int i = 0;i<x.length;i++){
            if(x[i]==c){
                count++;
            }
        }
        System.out.println("Count of a in string is : "+ count);
    }
}
