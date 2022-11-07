// Q6- Write a Java code with a random number generator that’s generate random number between 1 to 6 simulates a dice.
import java.lang.Math;
import java.util.Scanner;
class RandomNumberGenerator
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int min=obj.nextInt();
        int max=obj.nextInt();
        System.out.println("The Random Number between "+min+" and "+max+" is "+(int)(Math.random()*(max-min+1)+min));
    }
}