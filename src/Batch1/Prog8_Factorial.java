package Batch1;

public class Prog8_Factorial {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Factorial of "+num+" is : "+fact(num));
    }
    public static int fact(int value){
        if(value > 0)
            return value*fact(value-1);
        else
            return 1;
    }
}