package Batch2;

public class Prog16_StringToIntegerConversion {
    public static void main(String[] args) {
        String str = "1234";

        int num = Integer.parseInt(str);
        System.out.println(num+1);

        str = String.valueOf(num);
        System.out.println(str+"abc");
    }
}
