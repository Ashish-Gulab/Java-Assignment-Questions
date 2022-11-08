// Q10-Write a program to determine the sum of the following harmonic series for a given value of n:1+1/2+1/3+………..+l/n
import java.util.Scanner;
class SumOfHarmonicSeries
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("The Sum is: "+sum);
    }
}