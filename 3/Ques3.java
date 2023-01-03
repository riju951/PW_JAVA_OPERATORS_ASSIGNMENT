import java.util.Scanner;

public class Ques3 {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number of three digit : ");
        int a = scn.nextInt();
        int b = a%10;
        a/=10;
        int c = b;
        b = a%10;
        a/=10;
        c +=b;
        c +=a;

        System.out.println("The sum is : " + c );
    }
}
