// Q12- Create a class with a method which sorts an array. An Array of size 15 must be created using user defined variable and values are given by user.
import java.util.Scanner;
class SortAnArray
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of Elements of the Array:");
        int n=obj.nextInt();
        System.out.println("Enter the elements of the Array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("The Unsorted Array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The Sorted Array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}