package Assignment2;
import java.util.Scanner;
class Prb7
{
    public static void main(String args[])
    {
        int temp=0;
        Scanner fc = new Scanner(System.in) ;
        System.out.println("Enter a array elements =");
        int n = fc.nextInt();
        
        int a[]= new int[n];
        
        for (int i=0;i<a.length;i++)
        {
            a[i] = fc.nextInt();
        }
            
           for (int i=0;i<a.length;i++)
           {
               for (int j=i+1;j<a.length;j++)
               {
                   if (a[i]<a[j])
                   {
                       temp = a[i];
                       a[i] = a[j];
                       a[j] = temp;
                   }
               }
           }
           System.out.println();
           System.out.println("Elements of array in descending order");
             
           for (int i=0;i<a.length;i++)
           {
               System.out.println(a[i]+" ");
           }
        }
        
    }
