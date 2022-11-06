// Q11- Write a program to convert the given temperature in Fahrenheit to celsius using the following conversion formula:C = (F - 32)/1.8
import java.util.Scanner;
class FahrenheitToCelcius
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double f=obj.nextDouble();
        obj.close();
        double c=(f-32)/1.8;
        System.out.println("The temperature in Celcius is: "+c);
    }
}
