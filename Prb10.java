package Assignment2;
import java.util.Scanner;
class Prb10
{
    public static void main(String args[])
    {
        Scanner fc = new Scanner(System.in);
        System.out.println("Enter a No of array elements");
        int sum=0,i,n = fc.nextInt();
         System.out.println("Enter a array elements");
        int a[]= new int[n];
        for( i=0;i<n;i++)
        
        {
            a[i] = fc.nextInt();
        }
        for (i=0;i<n;i++)
        {
        for(int j=i;j<=i;j++)
        {
        if(a[j]%2==0)
        {
            sum=sum+a[j];
             System.out.println("sum of even elements"+sum);
        }
        else
        {
            sum=sum+a[j];
             System.out.println("sum of odd elements"+sum);
        }
        }
    }
    }
}

