// Q4- Write a program to input a number and check whether it is a palindrome or not.
import java.util.Scanner;
class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        obj.close();
        int reverse=Palindrome(n);
        if(reverse==n)
        {
            System.out.println(n+" is a Palindrome number.");
        }
        else
        {
            System.out.println(n+" is not a Palindrome number.");
        }
    }
    public static int Palindrome(int num)
    {
        int reverse=0;
        while(num>0)
        {
            int number=num%10;
            reverse=reverse*10+number;
            num=num/10;
        }
        return reverse;
    }
}