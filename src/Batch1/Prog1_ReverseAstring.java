//Reverse a string
package Batch1;

public class Prog1_ReverseAstring {
    public static void main(String[] args) {
        String str = "Baljinder";

        System.out.println(rev(str));

    }
    public static String rev(String string){
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for(char ch : string.toCharArray()){
            sb.append(string.charAt(string.length()-1-i));
            i++;
        }
        return sb.toString();
    }
}
