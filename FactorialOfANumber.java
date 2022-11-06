// Q1- Write a program for calculating and prints a factorial of a number.
import java.util.Scanner;
class FactorialOfANumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        System.out.print("The Factorial of "+n+" is ");
        int fact=Factorial(n);
        obj.close();
        System.out.print(fact);
    }
    public static int Factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}