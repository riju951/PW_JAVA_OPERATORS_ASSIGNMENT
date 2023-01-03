import java.util.Scanner;

public class Ques1{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scn.nextInt();
        System.out.println("Enter another number : ");
        int b = scn.nextInt();
        System.out.println("Before swapping : a = " + a + " b = " + b);
        a +=b ;
        b = a-b;
        a -=b ;
        System.out.println("After swapping : a = " + a + " b = " + b);
    }
}