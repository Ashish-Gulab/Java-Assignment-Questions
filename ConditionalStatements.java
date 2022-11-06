/*
Q14- Write a program that will read the value of x and evaluate the following function:
Y= {1 for x > 0}
 {0 for x = 0}
 {-1 for x < 0}
Using 
(a) Nested if statement
(b) Else if statements, and
(c) Conditional operator ?:.
*/
import java.util.Scanner;
class ConditionalStatements
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=obj.nextInt();
        // using nested if Statement
        System.out.println("Using Nested If Statement: ");
        System.out.print("The value of Y is: ");
        nestedIf(n);

        // using nested if Statement
        System.out.println("Using Else If Statement: ");
        System.out.print("The value of Y is: ");
        ifElse(n);

        // using nested if Statement
        System.out.println("Using Conditional opeartors: ");
        System.out.print("The value of Y is: ");
        
    }
    public static void nestedIf(int x)
    {
        if(x<0)
        {
            System.out.println("-1");
        }
        if(x==0)
        {
            System.out.println("0");
        }
        if(x>0)
        {
            System.out.println("1");
        }
    }
    public static void ifElse(int num)
    {
        if(num<0)
        {
            System.out.println("-1");
        }
        else if(num>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
    // public static void conditionals(int n)
    // {
    //     int num=(x>0)?
    // }
}