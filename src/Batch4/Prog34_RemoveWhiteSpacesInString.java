//Remove all white spaces from a string
package Batch4;

public class Prog34_RemoveWhiteSpacesInString {
    public static void main(String[] args) {
        String str = "I want to learn programming";
        StringBuffer sb = new StringBuffer();
        for(Character i : str.toCharArray()){
            if(i != 32){
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}
