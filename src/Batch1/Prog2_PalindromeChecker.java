package Batch1;

public class Prog2_PalindromeChecker {
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(str+" is palindrome : "+checkPldm(str));
    }
    public static Boolean checkPldm(String string){
        StringBuffer sb = new StringBuffer();
        int i= 0;
        for(char ch : string.toCharArray()){
            sb.append(string.charAt(string.length()-1-i));
            i++;
        }
        Boolean flag = sb.toString().equals(string) ? true : false;
        return flag;
    }
}
