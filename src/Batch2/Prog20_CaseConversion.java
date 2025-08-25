package Batch2;

public class Prog20_CaseConversion {
    public static void main(String[] args) {
        String str = "Baljinder Singh";
        StringBuffer sb = new StringBuffer();

        for(char ch : str.toCharArray()){
            if(ch < 90 && ch > 32){
                ch += 32;
            } else if (ch > 89) {
                ch -= 32;
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}