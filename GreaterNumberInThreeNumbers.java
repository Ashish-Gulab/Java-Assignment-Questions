// Q15- Write a program for a comparison between three numbers?
import java.util.Scanner;
class GreaterNumberInThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int n3=obj.nextInt();
        // System.out.println();
        System.out.print("The Greater Number is: ");
        if(n1>n2 && n1>n3)
        {
            System.out.print(n1);
        }
        else if(n3>n2 && n3>n1)
        {
            System.out.print(n3);
        }
        else
        {
            System.out.print(n2);
        }
    }
}