// Q16- Write a program to print the area of triangle by creating a class “Area” having two methods.
import java.util.Scanner;
class Area 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the three sides of a triangle: ");
        float a=obj.nextInt();
        float b=obj.nextInt();
        float c=obj.nextInt();
        areaTriangle(a,b,c);
    }
    public static void areaTriangle(float a,float b,float c)
    {
        float d=(a+b+c)/2;
        float area=(float)Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.println("The Area of a Triangle: "+area);
    }
}