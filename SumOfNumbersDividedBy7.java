// Q13- Write a program to find a sum of all integers greater than 100 and less than 200 that are divisible by 7.
import java.util.Scanner;
class SumOfNumbersDividedBy7
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int sum=SumNumbers(n1,n2);
        System.out.print(sum);
    }
    public static int SumNumbers(int num1,int num2)
    {
        int sum=0;
        for(int i=num1+1;i<=num2-1;i++)
        {
            if(i%7==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}