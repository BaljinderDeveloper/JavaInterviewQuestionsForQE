package Batch1;

public class Prog2_PalindromeChecker_2 {
    public static void main(String[] args) {
        String str = "mom";

        StringBuffer sb = new StringBuffer(str);
        Boolean flag = sb.reverse().toString().equals(str) ? true : false;
        System.out.println(str +"is a palindrome : "+flag);
    }
}
