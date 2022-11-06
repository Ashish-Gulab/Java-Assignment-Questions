// Q5- Write a program to input a string and convert all the uppercase letter to lowercase and lowercase to uppercase.
import java.util.Scanner;
class ConvertAllStringIntoUpperCaseOrLowerCase
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=obj.nextLine();
        System.out.println("String in Lower Case: "+s.toLowerCase());
        System.out.println("String in Upper Case: "+s.toUpperCase());
    }
}