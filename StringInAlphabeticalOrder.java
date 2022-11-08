// Q9- Write a program which will read a string and rewrite it in alphabetical order. For example, the word STRING should be written as GINRST.
import java.util.Scanner;
class StringInAlphabeticalOrder
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=obj.next();
        System.out.println("The String in Alphabetical order is ");
        char ch=s.charAt();
        ch.ArraySort();
        System.out.println(ch.toString(s));
    }
}