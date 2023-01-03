import java.util.Scanner;

public class Main1 {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = a+8;
        b/=3;
        b%=5;
        b*=5;
        System.out.println(b);
    }
}