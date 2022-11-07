// Q2- Write a program to reverse the digits of a number. For Example 12345 should be written as 54321.
import java.util.Scanner;
class ReverseANumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        obj.close();
        int reverse=ReverseNumber(n);
        System.out.println("The Reverse of "+n+" is "+reverse);
    }
    public static int ReverseNumber(int num)
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