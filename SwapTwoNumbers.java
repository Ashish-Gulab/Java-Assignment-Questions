// Q7-Write a java code to swap two numbers without using third variable.
import java.util.Scanner;
class SwapTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        obj.close();
        System.out.println("The numbers before Swapping: "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The numbers after Swapping: "+a+" "+b);
    }
}