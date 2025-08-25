//Extract only digits from an Alphanumeric String
package Batch4;

public class Prog35_ExtractOnlyDigits {
    public static void main(String[] args) {
        String numStr = "abc123def456efg789";
        StringBuffer sb = new StringBuffer();
        for(Character ch : numStr.toCharArray()){
            if(ch < 65){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
