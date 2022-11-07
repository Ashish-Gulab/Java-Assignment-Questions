// Q8- Write a program which will print as output:
//        1
//       1 2
//      1 2 3
//     1 2 3 4
import java.util.Scanner;
class pattern 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj.nextInt();
        obj.close();
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=(n-i);space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}