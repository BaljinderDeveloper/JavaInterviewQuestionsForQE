package Batch1;

public class Prog3_Swap2Nums {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        a = (a + b) - (b = a);
    }
}
